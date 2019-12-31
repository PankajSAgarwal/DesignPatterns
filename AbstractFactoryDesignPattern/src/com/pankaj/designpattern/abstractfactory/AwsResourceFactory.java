package com.pankaj.designpattern.abstractfactory;

import com.pankaj.designpattern.abstractfactory.Instance.Capacity;
//Factory implementation for aws resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		
		return new EC2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		
		return new S3Storage(capMib);
	}

}
