package com.pankaj.designpattern.abstractfactory;

import com.pankaj.designpattern.abstractfactory.Instance.Capacity;
//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		
		return new GoogleComputeInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		
		return new GoogleCloudStorage(capMib);
	}

}
