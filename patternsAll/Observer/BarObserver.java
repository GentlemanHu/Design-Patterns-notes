package Observer;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

/**
 * BarObserver
 */
public class BarObserver extends JFrame implements Observer {
      /**
      *
      */
      private static final long serialVersionUID = 3638768659538315603L;
      private Bar bar = new Bar(new Dimension(100, 70));

      public BarObserver() {
            super("BarObserver");
            setPreferredSize(new Dimension(500, 100));
            setLayout(new FlowLayout());
            setBackground(Color.DARK_GRAY);
            add(bar);

            pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(3);
      }

      @Override
      public void update(NumberGenerator generator) {
            bar.update(generator);
      }

}

class Bar extends JProgressBar implements Observer {
      /**
      *
      */
      private static final long serialVersionUID = -6014984133628211336L;
      private int number;
      private NumberGenerator generator;

      public Bar(Dimension dimension) {
            setSize(dimension);
            setVisible(true);
      }

      // @Override
      // public void paint(Graphics g) {
      //       float flo = generator.getNumber();
      //       Graphics2D g2 = (Graphics2D) g;
      //       GradientPaint gradientPaint1 = new GradientPaint(flo, flo, Color.red, flo, flo, Color.YELLOW);
      //       g2.setPaint(gradientPaint1);
      //       g2.fill(new Rectangle2D.Double(100, 100, 300, 100));

      //       GradientPaint blueToBlack = new GradientPaint(0, 0, Color.BLUE, 400, 400, Color.BLACK);
      //       g2.setPaint(blueToBlack);
      //       g2.fill(new Rectangle2D.Double(50, 160, 300, 100));
      // }

      @Override
      public void update(NumberGenerator generator) {
            this.generator = generator;
            number = generator.getNumber();
            setStringPainted(true);
            //setForeground(Color.CYAN);

            setValue(number);
            repaint();
            // bar.repaint();
      }

}