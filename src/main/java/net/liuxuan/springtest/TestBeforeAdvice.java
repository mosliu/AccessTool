/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.liuxuan.springtest;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Moses
 */
public class TestBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method m, Object[] args, Object target)
            throws Throwable {
        System.out.println("Hello world! (by "
                + this.getClass().getName()
                + ")" + m.getName());

        System.exit(0);
    }
}
