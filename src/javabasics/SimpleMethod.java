package javabasics;

public class SimpleMethod {

	public static void addNum(int num1, int num2) {
		System.out.println("The sum of two numbers is "+(num1+num2));
		
	}
	public static void diffNum(int num1, int num2) {
		System.out.println("The difference of two numbers is "+(num2-num1));
	}
	public static void main(String[]args) {
		addNum(4,7);
		diffNum(4,10);
	}
}
