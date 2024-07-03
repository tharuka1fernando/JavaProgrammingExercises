package hackerRankPractice;

//Question

// That given an array A of N integers,returns the smallest positive integer(greater than 0),that does not 
// occur in A.
// Ex:- given A =[1,3,6,4,1,2] the function should return 5
// Ex 2 = A =[1,2,3] the function should return 4
// Ex 3 = A=[-1,-3] the function should return 1
// Wrtite the efficient algorithm for following assumptions
// N is an integer within the range [1...100000]
// each element of array A is an integer within the range [-1000000..1000000]

import java.util.*;

public class ReturnTheSmallestpositiveInteger {

	public static int solution(int[] A) {

		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			set.add(a);
		}
		for (int i = 1; i <= A.length + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> A = new HashSet<>();
		A.add(1);
		A.add(3);
		A.add(6);
		A.add(4);
		A.add(1);
		A.add(2);

//		int i = solution(int[]5);
//		System.out.println(i);
//
//	}
	}
}
