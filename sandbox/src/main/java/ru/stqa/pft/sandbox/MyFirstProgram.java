package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main (String[] args) {
		
		hey("Java");
		double l = 5;
		double a = 4;
		double b = 6;
		System.out.println("Площадь = " + area(l) );
		System.out.println("Умножение = " + area(a, b));
	}
	public static void hey(String something) {
		System.out.println("Hey " + something);
	}
	public static double area (double len) {
		return len * len;
	}

	public static double area (double a, double b) {
		return a + b;

	}
}