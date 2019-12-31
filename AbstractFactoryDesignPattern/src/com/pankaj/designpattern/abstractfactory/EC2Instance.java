package com.pankaj.designpattern.abstractfactory;

// Represents a concrete product in a family "Amazon Web Services"
public class EC2Instance implements Instance {
	
	public EC2Instance(Capacity capacity) {
		// Map capacity to ec2 instance types. Use aws API to provision
		System.out.println("Created EC2 instance");
	}

	@Override
	public void start() {
		System.out.println("EC2 instance started");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage +" to EC2 instance.");

	}

	@Override
	public void stop() {
		System.out.println("EC2 instance stopped.");

	}

	@Override
	public String toString() {
		return "EC2Instance";
	}
	
	

}
