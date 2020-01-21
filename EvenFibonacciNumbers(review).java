static void result(int n) {
		int result = 0;
		int first = 1;
		int second = 2;
		int third = 0;
		
		while(third < n) {
			third = second + first;
			second = third;
			first = second;
			
			if(third % 2 == 0) {
				result += third;
			}
		System.err.println("result==" + result);
		}
	}