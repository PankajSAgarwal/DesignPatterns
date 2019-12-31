package com.pankaj.designpattern.abstractfactory;

//Represents a concrete product in a family "Google Cloud Platform"

public class GoogleCloudStorage implements Storage {
	
	public GoogleCloudStorage(int capacityInMib) {
		//Use gcp api
		System.out.println("Allocated " + capacityInMib +" on Google Cloud Storage .");
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "gcpcs1";
	}

	@Override
	public String toString() {
		return "Google cloud Storage";
	}

}
