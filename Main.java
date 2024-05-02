package com.pojo.Application1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
		public static void main(String args[])
		{
			//This is the example of using config.xml file.
//			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//			Customer customer=context.getBean(Customer.class);
//			System.out.println(customer);
//			
//			Order order=context.getBean("order1",Order.class);
//			System.out.println(order);
//			
//			//In mart class i have injected customer and order class 
//			Mart mart=context.getBean("mart1",Mart.class);
//			System.out.println(mart);
//			ExpertListMap elm=context.getBean("em1",ExpertListMap.class);
//			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//			ApplicationContext context=new AnnotationConfigApplicationContext(FirstF.class);
//			Customer customer=context.getBean(Customer.class);
//			System.out.println(customer);
			
			ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
			ExpertListMap elm=context.getBean("expert",ExpertListMap.class);
			System.out.println(elm);
			
	
		}
}
