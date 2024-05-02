package com.pojo.Application1;
import java.util.List;
import java.util.Map;

public class ExpertListMap {

	List<Integer> marks;
		Map<String,String> contact;
		public List<Integer> getMarks() {
			return marks;
		}
		public void setMarks(List<Integer> marks) {
			this.marks = marks;
		}
		public Map<String, String> getContact() {
			return contact;
		}
		public void setContact(Map<String, String> contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "ExpertListMap [marks=" + marks + ", contact=" + contact + "]";
		}

	}
