package com.pankaj.designpattern.builder;



//A product in builder pattern
public class UserWebDTO implements UserDTO {
	
	private String name;
	
	private String address;
	
	private String age;
	
	

	public UserWebDTO(String name, String address, String age) {
		
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getAddress() {
		
		return address;
	}

	@Override
	public String getAge() {
		
		return age;
	}
	
	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}

}
