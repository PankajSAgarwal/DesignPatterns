package com.pankaj.designpattern.singleton.eagersingleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class Client {

	public static void main(String[] args) {
		
		EagerRegistry registry1 = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		
		System.out.println(registry1 == registry2);

	}

}
