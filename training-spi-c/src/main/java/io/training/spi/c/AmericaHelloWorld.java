package io.training.spi.c;

import io.training.spi.api.HelloWorld;

public class AmericaHelloWorld implements HelloWorld {

	@Override
	public String say() {
		System.out.println("============America Hello World============");
		return "America Hello World";
	}

}
