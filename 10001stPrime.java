/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class Main {

	public static void main(String[] args) {
        result();
	}
	
	public static void result() {
		int primeNum = 0;
	    int counter = 0;
	    
		for (int num = 2; num < 1000000; num++) {
	        boolean isPrime = true;
	        
	        for (int j = 2; j < num; j++) {
	        	if (num % j == 0) {
	        		isPrime = false;
	        		break;
	        	}
 	        }
	        if (isPrime) {
	        	primeNum = num;
	        	counter++;
	        }
	        if (counter == 10001) {
	        	break;
	        }
		}
        System.out.println(primeNum);
    }
}