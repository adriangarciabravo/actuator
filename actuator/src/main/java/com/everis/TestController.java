package com.everis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;

@RestController
public class TestController {

	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("invocaciones totales").register(registy);
	
	}
	
@GetMapping(path="/helloworld")
public String helloWordl() {
	counter.increment();
	return "Hello World";
}
}
