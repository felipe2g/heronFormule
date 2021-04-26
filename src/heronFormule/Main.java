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
		
		Double pX, areaX, pY, areaY;
		
		System.out.println("Enter the measures of triangle X: ");
		triangleA.a = sc.nextDouble();
		triangleA.b = sc.nextDouble();
		triangleA.c = sc.nextDouble();

		pX = (triangleA.a + triangleA.b + triangleA.c) / 2;
		areaX = Math.sqrt(pX * (pX - triangleA.a) * (pX - triangleA.b) * (pX - triangleA.c));
		
		
		System.out.println("Enter the measures of triangle Y: ");
		triangleB.a = sc.nextDouble();
		triangleB.b = sc.nextDouble();
		triangleB.c = sc.nextDouble();

		pY = (triangleB.a + triangleB.b + triangleB.c) / 2;
		areaY = Math.sqrt(pY * (pY - triangleB.a) * (pY - triangleB.b) * (pY - triangleB.c));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.print("Larger area: X");
		} else {
			System.out.print("Larger area: Y");
		}
		
		sc.close();
	}

}
