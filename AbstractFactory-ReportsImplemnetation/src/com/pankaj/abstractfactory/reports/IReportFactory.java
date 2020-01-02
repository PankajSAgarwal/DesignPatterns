package com.pankaj.abstractfactory.reports;

public interface IReportFactory {
	
	public AReport createReport(String type,String name);

}
