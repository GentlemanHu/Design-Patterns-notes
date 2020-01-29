package State;

public class NightState implements State{
      private final static NightState singleton = new NightState();

      private NightState(){}

      public final static synchronized State getInstance() {
            return singleton;
      }


      @Override
      public void doClock(Context context, int hour) {
            if (hour >= 9 && 17 > hour) {
                  context.changeState(DayState.getInstance());
            }

      }

      @Override
      public void doUse(Context context) {
            context.recordLog("使用金库(晚上)");
      }

      @Override
      public void doAlarm(Context context) {
            context.callSecurityCenter("按下警铃(晚上)");
      }

      @Override
      public void doPhone(Context context) {
            context.callSecurityCenter("录音通话(晚上)");
      }

      public String toString(){
            return "[晚上]";
      }
}
