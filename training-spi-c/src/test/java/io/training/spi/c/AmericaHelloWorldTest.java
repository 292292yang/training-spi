package io.training.spi.c;

import io.training.spi.api.HelloWorld;

import java.util.ServiceLoader;

import org.junit.Test;

public class AmericaHelloWorldTest {
	@Test
	public void testSay() {
		ServiceLoader<HelloWorld> loaders = ServiceLoader
				.load(HelloWorld.class);
		for (HelloWorld in : loaders) {
			in.say();
		}
	}
}
