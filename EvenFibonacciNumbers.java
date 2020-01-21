static void result() {
		int[] lst = new int[100000];
		lst[0] = 1;
		lst[1] = 2;
		int sum = lst[1];
			for (int i = 0; lst[i] <= 4000000; i++) {
		    	lst[i + 2] = lst[i] + lst[i + 1];
		    	if(lst[i + 2] % 2 == 0) {
		    		System.out.println("number" + lst[i + 2]);
		    		sum += lst[i + 2];
		    		System.out.println("sum" + sum);
		    	}
		    }
	}