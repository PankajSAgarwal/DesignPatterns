package com.pankaj.abstractfactory.reports;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		String [] reports = {"IN_INV_001.txt","OUT_PUR_001.txt","IN_INV_002.txt", "IN_PUR_001.txt", "OUT_PUR_002.txt", "OUT_INV_001.txt", "IN_INV_003.txt"};
        String tmp[] = null;
		
        Archive a = new Archive();

        for (String s: reports) {
            tmp = s.split("_");
            a.addReport(tmp[0], tmp[1], s);
        }

        a.processAllReports();
    }

	}


