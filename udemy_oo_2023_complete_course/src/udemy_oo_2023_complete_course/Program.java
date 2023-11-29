package udemy_oo_2023_complete_course;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	int a = 0;
	int c = 0;
	int b = 0;
	if (a > b && a > c) {
			System.out.print("Higher = " + a);
		}
		else if (b > a && b > c) {
			System.out.print("Higher = " + b);
			
	}	else {
		System.out.print("Higher = " + c);
		
	}
	
	
	
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}

	private static void showResult(int higher) { 
		// TODO Auto-generated method stub
		
		System.out.println("Higher = " + higher);
		
	}
   
	private static int max(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a > b && a > c) {
			System.out.print("Higher = " + a); 
		}
		else if (b > a && b > c) {
			System.out.print("Higher = " + b);
			
	}	else {
		System.out.print("Higher = " + c);
		
	}
		return 0;
	}
}
