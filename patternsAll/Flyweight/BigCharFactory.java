/*
 * @Author: Gentleman.Hu 
 * @Date: 2020-02-19 19:43:22 
 * @Last Modified by: Gentleman.Hu
 * @Last Modified time: 2020-02-19 19:51:07
 */
package Flyweight;

import java.util.HashMap;

/**
 * BigCharFactory
 */
public class BigCharFactory {
    private HashMap<String, BigChar> pool = new HashMap<String, BigChar>();

    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}