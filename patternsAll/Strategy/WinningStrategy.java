package Strategy;

import java.util.Random;

/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-16 16:10:54 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-16 16:12:07
 */
/**
 * WinningStrategy
 */
public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand preHand;
    public WinningStrategy(int seed){
        random = new Random(seed);
    }
    
    public Hand nextHand(){
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    public void study(boolean win){
        won = win;
    }
}