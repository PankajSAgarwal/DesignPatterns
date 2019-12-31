package com.pankaj.designpattern.abstractfactory;
//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeInstance implements Instance {

	public GoogleComputeInstance(Capacity capacity) {
		// Map capacity to GCP compute instance types. Use GCP API to provision
		System.out.println("Created Google Compute Engine Instace");
	}
	@Override
	public void start() {
		System.out.println("Compute Instance instance started");

	}
	
	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage +" to Compute Engine instance.");

	}

	@Override
	public void stop() {
		System.out.println("Compute Engine instance stopped.");

	}

}
