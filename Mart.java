package com.pojo.Application1;

public class Mart {
	
		String location;
		Customer customer;
		Order order;
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
		@Override
		public String toString() {
			return "Mart [location=" + location + ", customer=" + customer + ", order=" + order + ", getLocation()="
					+ getLocation() + ", getCustomer()=" + getCustomer() + ", getOrder()=" + getOrder()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}		
		
}