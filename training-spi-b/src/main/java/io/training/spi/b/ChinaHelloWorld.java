package io.training.spi.b;

import io.training.spi.api.HelloWorld;

public class ChinaHelloWorld implements HelloWorld{

	@Override
	public String say() {
		System.out.println("============China Hello World============");
		return "China Hello World";
	}

}
