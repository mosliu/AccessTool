/*
 * Copyright 2014 Moses.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.liuxuan.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    private final static Logger logger = LoggerFactory.getLogger(Main.class); 
    
    public static void main(String [] args)
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "conf/applicationContext.xml");
        JNotePadUI jNotePadUI = (JNotePadUI) context.getBean("JNotePadUI");
        jNotePadUI.setVisible(true);
        
        
        logger.info("logback 成功了");
        logger.error("logback 成功了");
    }

}