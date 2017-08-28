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

}
