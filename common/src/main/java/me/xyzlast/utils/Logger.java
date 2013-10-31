package me.xyzlast.utils;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/28/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Logger {
    public void debug(String message) {
        System.out.println(message);
    }

    public void error(Exception ex) {
        System.out.println(ex.getMessage());
    }
}
