static int result(int n) {
		int sum15 = 0;
		int sum3 = 0;
    	int sum5 = 0;
	    for (int i = 1; i < n; i++) {
	    	if(i % 15 == 0) {
	    		sum15 += i;
	    	}
	    	else if(i % 3 == 0) {
	    		sum3 += i ;
	    	}
	    	else if(i % 5 == 0) {
	    		sum5 += i;
	    	}
	    }
	    return sum15 + sum3 + sum5;
	}