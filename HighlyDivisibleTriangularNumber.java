public class Main {
    
    public static void main(String[] args) {
    	int j = 0; 
        int n = 0; 
        int numberOfDivisors = 0; 
        while (numberOfDivisors <= 500) {

            numberOfDivisors = 0;
            j++;
            n = number(j);
            
           
            for (int i = 1; i <= Math.sqrt(n); i++) {
            	 if (n % i == 0) {
                 	numberOfDivisors++;
                 }
            }
            numberOfDivisors *= 2;
        }
        System.out.println(n);
    }
    public static int number(long n) {
    	int num = 0;
    	for (int i = 1; i <= n; i++) {
    		num += i;
    	}
    	return num;
    }
}
