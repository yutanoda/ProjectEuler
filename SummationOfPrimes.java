public class Main {

	public static void main(String[] args) {
        result();
	}
	
	public static void result() {
		long primeSum = 0;
	    
		for (int num = 2; num < 2000000; num++) {
	        boolean isPrime = true;
	        
	        for (int j = 2; j < num; j++) {
	        	if (num % j == 0) {
	        		isPrime = false;
	        		break;
	        	}
 	        }
	        if (isPrime) {
	        	primeSum += num;
	        }
		}
		System.out.println(primeSum);
    }
}