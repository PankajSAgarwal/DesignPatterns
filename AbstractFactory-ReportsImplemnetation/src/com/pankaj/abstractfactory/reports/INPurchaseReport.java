package com.pankaj.abstractfactory.reports;

public class INPurchaseReport extends AINReport {

	protected INPurchaseReport(String name) {
		super(name);
	}

	@Override
	public void processReport() {
		super.processReport();
		System.out.println("Performing IN Reports Purchase specific stuff");
	}

}
