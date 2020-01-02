package com.pankaj.abstractfactory.reports;

public abstract class AINReport extends AReport {

	protected AINReport(String name) {
		super(name);
		
	}

	@Override
	public void processReport() {
		// TODO Auto-generated method stub
		super.processReport();
		System.out.println("Performing IN Reports common stuff");
	}
	
	

}
