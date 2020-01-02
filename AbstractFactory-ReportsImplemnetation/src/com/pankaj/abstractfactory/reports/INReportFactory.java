package com.pankaj.abstractfactory.reports;

public class INReportFactory implements IReportFactory {

	@Override
	public AReport createReport(String type, String name) {
		AReport doc = null;
		switch(type) {
				case "INV":
		            doc = new INInvoiceReport(name);
		        break;
		        case "PUR":
		            doc = new INPurchaseReport(name);
		        break;
		        default:
		            break;
		}
		return doc;
	}

}
