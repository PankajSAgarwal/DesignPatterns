package com.pankaj.abstractfactory.reports;

public abstract class FactoryProvider {
	
	public static IReportFactory getFactory(String factoryType) {
		
		IReportFactory rf = null;
		switch(factoryType) {
		case "IN":
            rf = new INReportFactory();
        break;
	    case "OUT":
	            rf = new OUTReportFactory();
	        break;
	    default:
	        break;
		}
		
		return rf;
	}

}
