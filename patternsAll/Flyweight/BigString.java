/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-19 19:51:43 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-19 19:55:50
 */
package Flyweight;

/**
 * BigString
 */
public class BigString {
    private BigChar[] bigchar;

    public BigString(String string) {
        bigchar = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchar.length; i++) {
            bigchar[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigchar.length; i++) {
            bigchar[i].print();
        }
    }

}