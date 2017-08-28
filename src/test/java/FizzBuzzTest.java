import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void shouldSayOne() {
		FizzBuzz underTest = new FizzBuzz();
		
		String response = underTest.say(1);
		
		assertEquals("1", response);
	}
	
	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz();
		
		String response = underTest.say(2);
		
		assertEquals("2", response);
	}

}
