package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;

public class InfraStack extends Stack {
	public InfraStack(final Construct scope, final String id) {
		this(scope, id, null);
	}

	public InfraStack(final Construct scope, final String id, final StackProps props) {
		super(scope, id, props);

		// The code that defines your stack goes here

		// example resource
		// final Queue queue = Queue.Builder.create(this, "InfraQueue")
		// .visibilityTimeout(Duration.seconds(300))
		// .build();

		// define a Lambda function that will Greet the user

		Function lambda = Function.Builder.create(this, "GreetingLambda").code(Code.fromAsset("../assets/function.jar"))
				.handler("com.rawat.demo.cdk.function.GreetingFunction").runtime(Runtime.JAVA_8).memorySize(1024)
				.timeout(Duration.minutes(1)).functionName("Greeting").build();

	}
}
