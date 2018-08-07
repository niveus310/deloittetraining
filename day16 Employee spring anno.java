package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
		private String employeeName;
		@Autowired(required=false)
		private Address address;

		public Employee() {
				System.out.println("Employee default cons called");
		}

		public Employee(String employeeName) {
			System.out.println("Employee name parameterized cons called");
			this.employeeName = employeeName;
		}
		
		public Employee(Address address) {
			System.out.println("Employee address parameterized cons called");
			this.address = address;
		}
		

		public Employee(String employeeName, Address address) {
			System.out.println("Employee two parameterized cons called");
			this.employeeName = employeeName;
			this.address = address;
		}

		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			System.out.println("address setter called");
			this.address = address;
		}


		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		
		
		@Override
		public String toString() {
			return "Employee [employeeName=" + employeeName + ", address=" + address + "]";
		}
		
}
