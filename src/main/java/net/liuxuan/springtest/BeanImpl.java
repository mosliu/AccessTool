/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.liuxuan.springtest;

/**
 *
 * @author Moses
 */
import javax.swing.JFrame;

public class BeanImpl implements Bean {

    public void theMethod() {
        System.out.println(this.getClass().getName()
                + "." + new Exception().getStackTrace()[0].getMethodName()
                + "()"
                + " says HELLO!");
    }

    public void log() {
//        new JFrame().setVisible(true);
        System.out.println("dddddddddddddddddddddddddd");
    }
}
