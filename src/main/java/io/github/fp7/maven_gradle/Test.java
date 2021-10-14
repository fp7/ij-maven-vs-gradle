package io.github.fp7.maven_gradle;

import com.google.errorprone.annotations.CheckReturnValue;

public class Test {

	public static void main(String[] args) {
		System.out.println(foo());
	}

	@CheckReturnValue
	public static String foo() {
		return "";
	}
}
