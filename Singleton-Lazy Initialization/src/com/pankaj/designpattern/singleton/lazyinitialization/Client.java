package com.pankaj.designpattern.singleton.lazyinitialization;

public class Client {

	public static void main(String[] args) {
		
		LazyRegistryWithDCL registry1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL registry2 = LazyRegistryWithDCL.getInstance();
		
		System.out.println(registry1 == registry2);

	}

}
