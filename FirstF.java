package com.pojo.Application1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class FirstF 
{
	@Configuration
	public class HeadConfigClass
	{
		@Bean
		public Customer customer1()
		{
			Customer customer=new Customer();
			customer.setCust_name("Ram");
			customer.setCust_mobile_no(7654321);
			return customer;
		}
		@Bean
		public Order order1()
		{
			Order order=new Order(101,26.90);

			return order;
		}
		@Bean
		public Mart mart1()
		{
			Mart mart=new Mart();
					mart.setCustomer(customer1());
					mart.setOrder(order1());
					mart.setLocation("kphb");
					return mart;

		}
	}
}
