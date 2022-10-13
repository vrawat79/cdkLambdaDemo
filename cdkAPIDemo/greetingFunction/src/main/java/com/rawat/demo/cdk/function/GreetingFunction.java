package com.rawat.demo.cdk.function;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingFunction implements RequestHandler<Map<String, String>, String> {

	public String handleRequest(Map<String, String> input, Context context) {
		return "Hello " + input.get("name") + "!!";
	}

}
