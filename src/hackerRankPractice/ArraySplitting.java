package hackerRankPractice;

import java.util.ArrayList;
import java.util.List;

// Question
// Given an array ofIntegers,determine the number of ways the entire array be split into 2 non-empty subarrays,
// left and right such that sum of elements in the left sub array is greater than the sum of elements 
// in the right sub array.

// Ex:- [10,4,-8,7]

// There are 3 ways to split into 2 non-empty sub arrays
// [10] and [4,-8,7] left sum =10,right sum=3
// [10] and [4,-8,7] left sum= 10+4 = 14 , right sum = -8+7=-1
// [10,4,-9] and [7] left sum = 6,right sum=7;
// The first 2 satisfy the condition that left sum>right sum,some the return value should be 2

public class ArraySplitting {

	public static int splitIntoTwo(List<Integer> arr) {

		int count = 0;
		for (int i = 1; i < arr.size() - 1; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			for (int x = 0; x < i; x++) {
				sumLeft += arr.get(x);
			}

			for (int y = i; y < arr.size(); y++) {
				sumRight += arr.get(y);
			}

			if (sumLeft > sumRight) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls = new ArrayList<>();

		ls.add(10);
		ls.add(4);
		ls.add(-8);
		ls.add(7);

		int count = splitIntoTwo(ls);
		System.out.println(count);

	}

}
