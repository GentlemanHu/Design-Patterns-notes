package State;

import javax.swing.*;
import static javax.swing.ScrollPaneConstants.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * SafeFrame
 */
public class SafeFrame extends JFrame implements ActionListener, Context {
      /**
      *
      */
      private boolean looponce = false;
      private int hour;
      private static final long serialVersionUID = -7178553962471402712L;
      private JTextField textClock = new JTextField(60);
      private JTextArea textScreen = new JTextArea(10, 60);
      private JButton buttonUse = new JButton("使用金库");
      private JButton buttonAlarm = new JButton("按下警铃");
      private JButton buttonPhone = new JButton("正常通话");
      private JButton buttonExit = new JButton("结束");
      private JScrollPane jScrollPane;
      private State state = DayState.getInstance();

      public SafeFrame(String title) {
            super(title);
            setBackground(Color.LIGHT_GRAY);
            setLayout(new BorderLayout());

            add(textClock, BorderLayout.NORTH);
            textClock.setEditable(false);

            textScreen.setEditable(false);
            jScrollPane = new JScrollPane(textScreen);
            jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
            add(jScrollPane, BorderLayout.CENTER);

            JPanel jPanel = new JPanel();
            jPanel.add(buttonUse);
            jPanel.add(buttonAlarm);
            jPanel.add(buttonPhone);
            jPanel.add(buttonExit);

            add(jPanel, BorderLayout.SOUTH);
            pack();

            this.setVisible(true);

            buttonAlarm.addActionListener(this);
            buttonExit.addActionListener(this);
            buttonPhone.addActionListener(this);
            buttonUse.addActionListener(this);

            this.setLocationRelativeTo(null);
      }

      @Override
      public void setClock(int hour) {
            this.hour = hour;
            String clockString = "现在时间是";
            if (hour < 10) {
                  clockString += "0" + hour + ":00";
            } else {
                  clockString += hour + ":00";
            }
            System.out.println(clockString);
            textClock.setText(clockString);
            state.doClock(this, hour);
      }

      public int getHour() {
            return hour;
      }

      @Override
      public void changeState(State state) {
            System.out.println("从" + this.state + "状态变为了" + state + "状态");
            this.state = state;
      }

      @Override
      public void callSecurityCenter(String msg) {
            textScreen.append("call!" + msg + "---------" + getHour() + ":00" + "\n");

      }

      @Override
      public void recordLog(String msg) {
            textScreen.append("record ..." + msg + "-----" + getHour() + ":00" + "\n");

      }

      @Override
      public void actionPerformed(ActionEvent e) {
            System.out.println(e.toString());
            if (e.getSource() == buttonUse) {
                  state.doUse(this);
            } else if (e.getSource() == buttonAlarm) {
                  state.doAlarm(this);
            } else if (e.getSource() == buttonPhone) {
                  state.doPhone(this);
            } else if (e.getSource() == buttonExit) {
                  System.exit(0);
            } else {
                  System.out.println("?");
            }
      }

      public void setColor() {
            // TODO: 改变颜色更加自然

            int r = 0;
            out2: for (r = 130; r < 256; r++) {
                  for (int g = 110; g < 256; g++) {
                        int b;
                        for (b = 150; b < 256; b++) {
                              // if (looponce) {
                              //       continue out2;
                              // }
                              if (b == 255) {
                                    int s = 105;
                                    out: for (b = 255; b >= 150; b--) {
                                          s--;
                                          textScreen.setBackground(new Color(r, g, b));
                                          System.out.println(r + "," + g + "," + b + ","+s);
                                          try {
                                                Thread.sleep(50);
                                          } catch (Exception ex) {
                                          }
                                          textScreen.repaint();
                                          if (s == 0) {
                                                //looponce = true;
                                                continue out2;
                                          }
                                    }
                              }
                        }
                  }
            }
      }

}