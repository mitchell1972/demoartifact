package com.example.demo;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;


public class DemoApplicationTests {
int sum = 1000;

	public synchronized void synchronisedCalculate() {
		getSum();
	}

	private int getSum(){
		return sum;
	}

	@Test
	public void givenMultiThread_whenMethodSync() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(300);
		DemoApplicationTests method = new DemoApplicationTests();

		IntStream.range(0, 100000)
				.forEach(count -> service.submit(method::synchronisedCalculate));
		service.awaitTermination(1000, TimeUnit.MILLISECONDS);

		assertEquals(1000, method.getSum());
	}


	@Test
	public void contextLoads() {
		IntStream in = IntStream.rangeClosed(0,1000);

		System.out.println(in.sum());


	}


}
