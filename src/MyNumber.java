//prashant basnet
//W0675107
import junit.framework.TestCase;

public class MyNumber extends TestCase {
	public int number;
	
	public void setValue(int a) {
		this.number=a;
	 }
	public int isPrime() {
		boolean isPrime=true;
		for(int divisor = 2; divisor <= number / 2; divisor++) {
		    if (number % divisor == 0) {
		    	isPrime=false;
		        break;
		    }
		}
		
		if(isPrime)return 0;else return -1;

	}
	public String printPrime() {
		return number+" is not Prime";
	}
	
	public void testPrimeNumber() {
		 MyNumber n = new MyNumber();
		 n.setValue(7);
		 assertEquals(0,n.isPrime());
		 n.setValue(10);
		 assertEquals(-1,n.isPrime());
		 assertEquals("10 is not Prime",n.printPrime());
	 }
	
	
	
	public void isEven(int a) {
		this.number=a;
	}
	
	public int isEven() {
		if(number%2==0) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public String printEven() {
		return number +" is Even";
	}
	
	public void testEvenNumber() {
		MyNumber n = new MyNumber();
		n.setValue(3);
		assertEquals(-1,n.isEven());
		n.setValue(2);
		assertEquals(0,n.isEven());
		assertEquals("2 is Even",n.printEven());
		
	}
	
}
