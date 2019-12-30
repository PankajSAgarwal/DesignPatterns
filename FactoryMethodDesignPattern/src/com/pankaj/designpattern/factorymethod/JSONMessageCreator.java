package com.pankaj.designpattern.factorymethod;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new JSONMessage();
	}

}
