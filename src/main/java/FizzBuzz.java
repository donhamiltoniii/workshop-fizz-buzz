
public class FizzBuzz {
	
	public String say(int inputNumber) {
		if (inputNumber % 3 == 0) {
			return "fizz";
		}
		if (inputNumber == 5) {
			return "buzz";
		}
		return "" + inputNumber;
	}
}
