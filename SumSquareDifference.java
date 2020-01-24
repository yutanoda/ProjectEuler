public class Main {

	public static void main(String[] args) {
        result();
	}
	public static void result() {
        long sum1 = 0;
        long sum2 = 0;
        long content = 0;
        long difference = 0;
        
        for (int i = 1; i < 101; i++) {
        	sum1 += i * i;
        	content += i;
        	
        }
        sum2 = content * content;
        difference = sum2 - sum1;
        System.out.println(difference);
    }
}
