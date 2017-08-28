import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz underTest = new FizzBuzz();
	
	@Test
	public void shouldSayOne() {
		String response = underTest.say(1);
		
		assertEquals("1", response);
	}
	
	@Test
	public void shouldSayTwo() {
		String response = underTest.say(2);
		
		assertEquals("2", response);
	}
	
	@Test
	public void shouldSayFizz() {
		String response = underTest.say(3);
		
		assertEquals("fizz", response);
	}
	
	@Test
	public void shouldSayBuzz() {
		String response = underTest.say(5);
		
		assertEquals("buzz", response);
	}
	
	@Test
	public void shouldSayFizzForSix() {
		String response = underTest.say(6);
		
		assertEquals("fizz", response);
	}
	
	@Test
	public void shouldSayBuzzForTen() {
		String response = underTest.say(10);
		
		assertEquals("buzz", response);
	}
	
	@Test
	public void shouldSayFizzBuzzForFifteen() {
		String response = underTest.say(15);
		
		assertEquals("fizzbuzz", response);
	}

}
