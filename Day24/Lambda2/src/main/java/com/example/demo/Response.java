package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	private String message;
	
	public Response(String message) {
		this.message=message;
	}
}
