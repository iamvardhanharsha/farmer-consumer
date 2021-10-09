package com.harsha.consumefarmerinfo.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FarmerInfoRequest {

	@NotNull(message = "name should not be emty")
	@Size(min = 2, max = 45, message = "size of name should be 2-45")
	private String name;
	@NotNull(message = "age should be between 28 to 60")
	private String age;
	@NotNull(message = "address cn not be emty")
	private String address;

	private String phoneNumber;
	private String state;

}
