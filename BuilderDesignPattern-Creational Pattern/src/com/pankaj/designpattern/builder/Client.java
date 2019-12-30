package com.pankaj.designpattern.builder;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO userDTO = directBuild(builder, user);
		System.out.println(userDTO);
	}
	// Director
	public static UserDTO directBuild(UserDTOBuilder builder, User user) {
		
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withAddress(user.getAddress())
			.withBirthDay(user.getBirthdate())
			.build();
		
		
	}
	
	/**
	 * Returns a sample user
	 */
	
	public static User createUser() {
		User user = new User();
		user.setBirthdate(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
		
	}

}
