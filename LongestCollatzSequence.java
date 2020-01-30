/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
*/

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		int limit = 1000000; // Limit is one million
		int size = 0, max = 1, j = 0;
		for (int i = 2; i < limit; i++) {
			size = getChainSize(i);
			if (size > max) {
				max = size;
				j = i;
			}
		}
		System.out.println(j);
	}

	private static int getChainSize(int n) {

		long num = n;
		List<Long> list = new ArrayList<>();
		int size = 0;
		while (num != 1) {
			list.add(num);
			/*
			 * As per Collatz sequence condition, if num is even then num=num/2
			 * else num=3*num+1
			 */
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}
		}
		size = list.size();
		return size;
	}

}