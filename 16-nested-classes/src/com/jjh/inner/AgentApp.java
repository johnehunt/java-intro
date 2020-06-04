package com.jjh.inner;

public class AgentApp {

	public static void main(String[] args) {
		Agent agent = new Agent("John", "10 High Street");
		agent.printSelf();
		System.out.println("============");
		agent.getAddress().printSelf();
	}

}
