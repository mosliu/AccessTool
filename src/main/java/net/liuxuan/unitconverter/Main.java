/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.liuxuan.unitconverter;

import net.liuxuan.springtest.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Moses
 */
public class Main {

    public static void main2(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "net/liuxuan/conf/applicationContext.xml");
        UnitConverterUI ui = (UnitConverterUI) context.getBean("UnitConverterUI");
        ui.setVisible(true);

    }

    public static void main(String[] args) {
        //Read the configuration file 
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext(
                "conf/applicationContext.xml");
//                  = new FileSystemXmlApplicationContext("conf/applicationContext.xml");
        //Instantiate an object 
        Bean x = (Bean) ctx.getBean("bean");
        //Execute the public method of the bean (the test) 
        x.theMethod();
        x.log();
    }
}
