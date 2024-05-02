package com.pojo.Application1;

public class Order {
	
		int order_id;
		double order_quantity;
		Order(){
			
		}
		public Order(int order_id, double order_quantity) {
			super();
			this.order_id = order_id;
			this.order_quantity = order_quantity;
		}
		@Override
		public String toString() {
			return "Order [order_id=" + order_id + ", order_quantity=" + order_quantity + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		


}
