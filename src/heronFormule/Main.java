package heronFormule;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle triangleA = new Triangle();
		Triangle triangleB = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		triangleA.a = sc.nextDouble();
		triangleA.b = sc.nextDouble();
		triangleA.c = sc.nextDouble();
		
		
		System.out.println("Enter the measures of triangle Y: ");
		triangleB.a = sc.nextDouble();
		triangleB.b = sc.nextDouble();
		triangleB.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f\n", triangleA.area());
		System.out.printf("Triangle Y area: %.4f\n", triangleB.area());
		
		if(triangleA.area() > triangleB.area()) {
			System.out.print("Larger area: X");
		} else {
			System.out.print("Larger area: Y");
		}
		
		sc.close();
	}

}
