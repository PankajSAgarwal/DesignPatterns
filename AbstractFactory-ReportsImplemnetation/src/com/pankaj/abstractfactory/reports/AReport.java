package com.pankaj.abstractfactory.reports;

public abstract class AReport {
	
	protected String name;
	
	protected AReport(String name) {
		this.name=name;
	}
	
	public void processReport() {
		System.out.println("Processing Report :"+this.name);
	}

}
