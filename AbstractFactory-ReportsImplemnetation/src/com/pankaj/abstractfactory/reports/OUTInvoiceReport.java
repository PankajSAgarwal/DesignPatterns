package com.pankaj.abstractfactory.reports;

public class OUTInvoiceReport extends AOutReport {

	protected OUTInvoiceReport(String name) {
		super(name);
		
	}

	@Override
	public void processReport() {
		
		super.processReport();
		System.out.println("Performing OUT Reports Invoice specific stuff");
	}

}
