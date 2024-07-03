package hackerRankPractice;

import java.util.Arrays;
import java.util.List;


public class Demo {
	
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(arg));
		m();
		m(5);
		
		
	}
	
	static void m() {
		System.out.println("Hello");
	}
	static void m(int x) {
		System.out.println("Hello");
	}
	static void m(List<String> list) {
		System.out.println("Hello");
	}
}
