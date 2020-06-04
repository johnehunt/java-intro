package com.jjh.inner;

public class Agent {
	
	class Address {
		
		private String addr;

		public Address(String addr) {
			this.addr = addr;
		}
		
		public void printSelf() {
			System.out.println("Address self: " + this);
			System.out.println("Agent self: " + Agent.this);
		}
		
	}
	
	private String name;
	private Address address;
	
	public Agent(String name, String addr) {
		this.name = name;
		this.address = new Address(addr);
	}
	
	public void printSelf() {
		System.out.println("Agent self: " + this);
	}
	
	public Address getAddress() {
		return this.address;
	}

}
