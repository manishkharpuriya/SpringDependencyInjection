package com.manish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spconfig.xml");
    	ProductBean pro = (ProductBean)context.getBean("id3");
    	System.out.println(pro);
    
    }
}
