package com.example.demo;
 
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
 
public class MyLambdaHandler implements RequestHandler<Object, String> {
 
	@Override
	public String handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		return "Hello I am from Lambda";
	}
}