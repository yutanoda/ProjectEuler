/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Main {

	public static void main(String[] args) {
        result();
	}
	public static void result() {
        int smallest = 1;
        int count = 0;
        for (int i = 1; i < 21; i++) {
        	 if (smallest % i != 0) {
        		smallest ++;
        		i = 1;
        	}
        }
     System.out.println(smallest);
    }
}