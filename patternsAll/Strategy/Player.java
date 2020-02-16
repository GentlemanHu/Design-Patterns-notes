package Strategy;
/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-16 15:58:52 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-16 16:05:44
 */

/**
 * Player
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(false);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

    public String toString() {
        return "[" + name + ":" + gamecount + " games," + wincount + " win, " + losecount + " lose" + "]";
    }
}