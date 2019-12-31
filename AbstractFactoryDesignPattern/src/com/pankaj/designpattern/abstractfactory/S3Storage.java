package com.pankaj.designpattern.abstractfactory;
//Represents a concrete product in a family "Amazon Web Services"

public class S3Storage implements Storage {
	
	public S3Storage(int capacityInMib) {
		// use aws s3 api
		System.out.println("Allocated " + capacityInMib +" on S3");
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "S31";
	}

	@Override
	public String toString() {
		return "S3 Storage";
	}
	
	

}
