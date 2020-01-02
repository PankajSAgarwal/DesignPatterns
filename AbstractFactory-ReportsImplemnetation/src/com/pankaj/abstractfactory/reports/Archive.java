package com.pankaj.abstractfactory.reports;

import java.util.ArrayList;
import java.util.List;

public class Archive {
	
	private List<AReport> reportList;
	
	public void addReport(String fam, String type, String name) {
        IReportFactory rf = FactoryProvider.getFactory(fam);
        if (this.reportList == null) {
            this.reportList = new ArrayList<AReport>();
        }
        this.reportList.add(rf.createReport(type, name));
    }
	
	public void processAllReports() {
		for (AReport r: this.reportList) {
            r.processReport();
            System.out.println("-----");
        }
	}

}
