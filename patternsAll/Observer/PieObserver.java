package Observer;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * PieObserver
 */
public class PieObserver extends JFrame implements Observer, ActionListener {
      /**
      	 *
      	 */
      private static final long serialVersionUID = 4817518335000616324L;
      private GraphCanvas canvasGraph = new GraphCanvas();
      private GraphText textGraph = new GraphText(60);
      private JButton buttonClose = new JButton("Close");
      private Bar bar = new Bar(new Dimension(100,70));
      public PieObserver() {
            super("PieObserver");
            setLayout(new BorderLayout());
            setBackground(Color.lightGray);
            textGraph.setEditable(false);
            canvasGraph.setSize(500, 650);
            add(textGraph, BorderLayout.NORTH);
            add(canvasGraph, BorderLayout.CENTER);
            add(bar, BorderLayout.SOUTH);
            buttonClose.addActionListener(this);
            pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(3);
      }

      public void update(NumberGenerator generator) {
            textGraph.update(generator);
            canvasGraph.update(generator);
            bar.update(generator);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            System.out.println(e.toString());
            System.exit(0);

      }

}

/**
 * InnerPieObserver
 */
class GraphText extends JTextField implements Observer {

      /**
      *
      */
      private static final long serialVersionUID = -3191756461229660957L;

      public GraphText(int columns) {
            super(columns);
      }

      public void update(NumberGenerator generator) {
            int number = generator.getNumber();
            String text = number + ":";
            for (int i = 0; i < number; i++) {
                  number = generator.getNumber();
                  text += "*";

            }
            this.setText(text);
      }
}

class GraphCanvas extends Canvas implements Observer {

      /**
      *
      */
      private static final long serialVersionUID = 6997258235740887043L;

      public GraphCanvas() {
      }

      private int number;

      public void update(NumberGenerator generator) {
            number = generator.getNumber();
            repaint();
      }

      public void paint(Graphics g) {
            int width = getWidth();
            int height = getHeight();
            g.setColor(new Color(255,number,number));
            g.fillArc(0, 0, width, height, 0, 360);
            g.setColor(Color.BLUE);
            g.fillArc(0, 0, width, height, 90, -number * 360 / 100);
      }
}