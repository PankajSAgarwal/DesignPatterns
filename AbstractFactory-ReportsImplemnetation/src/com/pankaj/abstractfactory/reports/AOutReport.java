package com.pankaj.abstractfactory.reports;

public abstract class AOutReport extends AReport {

	protected AOutReport(String name) {
		super(name);
		
	}

	@Override
	public void processReport() {
		// TODO Auto-generated method stub
		super.processReport();
		System.out.println("Performing OUT Reports common stuff");
	}
	
	

}
