package com;

public class Address {
			private String city;
			private String state;
			private int id;
			
			public Address() {
				// TODO Auto-generated constructor stub
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public Address(String city, String state, int id) {
				System.out.println("Invoking parameterized constructor of address");
				this.city = city;
				this.state = state;
				this.id = id;
			}
			
			
			@Override
			public String toString() {
				return "Address [city=" + city + ", state=" + state + ", id=" + id + "]";
			}
			
			
}
