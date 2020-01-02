package com.pankaj.abstractfactory.reports;

public class OUTPurchaseReport extends AOutReport {

	protected OUTPurchaseReport(String name) {
		super(name);
		
	}

	@Override
	public void processReport() {
		
		super.processReport();
		System.out.println("Performing OUT Reports Purchase specific stuff");
	}
	
	

}
