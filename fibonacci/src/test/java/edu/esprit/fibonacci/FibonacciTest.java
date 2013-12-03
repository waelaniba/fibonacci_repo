package edu.esprit.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	Fibonacci fibonacci;

	@Before
	public void init() {

		fibonacci = new Fibonacci();
	}

	@Test
	public void shouldReturnZeroWhenZeroIn() {

		assertEquals(0, fibonacci.fibo(0));

	}
	
	@Test
	public void shouldReturnOneWhenOneIn() {

		assertEquals(1, fibonacci.fibo(1));

	}	
	
	@Test
	public void shouldReturnOneWhenTwoIn() {

		assertEquals(1, fibonacci.fibo(2));

	}	
	
	@Test
	public void shouldReturn13When7In() {

		assertEquals(13, fibonacci.fibo(7));

	}		

}
