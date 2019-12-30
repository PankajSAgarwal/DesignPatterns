package com.pankaj.designpattern.builder;

import java.time.LocalDate;

// Abstract Builder
public interface UserDTOBuilder {
	
	// methods to build "parts" of proudct at a time
	
	UserDTOBuilder withFirstName(String fname);
	UserDTOBuilder withLastName(String lname);
	UserDTOBuilder withBirthDay(LocalDate date);
	UserDTOBuilder withAddress(Address address);
	
	// method to "assemble" final product
	UserDTO build();
	
	// (optional) method to fetch already built object
	
	UserDTO getUserDTO();
	
	
	

}
