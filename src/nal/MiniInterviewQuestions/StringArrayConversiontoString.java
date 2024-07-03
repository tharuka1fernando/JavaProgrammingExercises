package nal.MiniInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrayConversiontoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question
		String[] arr = { "t", "r", "v" };

		// Answer - 01.By Using String "Join" Method

		String join = String.join(";", arr); // We can use any separator or not use any separator
		System.out.println(join);

		// Answer - 02.By Using Stream

		String join1 = Arrays.asList("t", "r", "y", "i", "n", "g").stream().collect(Collectors.joining(" | "));
		System.out.println(join1);

		// 03.Calling generic method
		System.out.println(joinString("", "T", "H", "A", "R", "U"));

		// Answer - 04.By Using Stream and Lambda Expression

		String join2 = Arrays.asList(1, 2, 89, 45, 100).stream().map(e -> String.valueOf(e))
				.collect(Collectors.joining(""));
		System.out.println(join2);

	}

	// Answer - 03.Use a generic method by String Builder

	public static String joinString(String seperator, String... values) {
		StringBuilder sb = new StringBuilder();
		int end = 0;

		for (String s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(seperator);
			}
		}
		return sb.substring(0, end);
	}

}
