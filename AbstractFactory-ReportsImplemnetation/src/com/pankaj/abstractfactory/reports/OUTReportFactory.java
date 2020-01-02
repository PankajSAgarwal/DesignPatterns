package com.pankaj.abstractfactory.reports;

public class OUTReportFactory implements IReportFactory {

	@Override
	public AReport createReport(String type, String name) {
		AReport doc = null;
		switch(type) {
        case "INV":
            doc = new OUTInvoiceReport(name);
        break;
        case "PUR":
            doc = new OUTPurchaseReport(name);
        break;
        default:
            break;
    }
		return doc;
	}

}
