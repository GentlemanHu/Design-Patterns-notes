/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-16 16:13:49 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-16 16:14:25
 */
package Strategy;

/**
 * Strategy
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}