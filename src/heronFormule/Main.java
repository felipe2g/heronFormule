package heronFormule;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double xa, xb, xc, ya, yb, yc, pX, areaX, pY, areaY;
		
		System.out.println("Enter the measures of triangle X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();

		pX = (xa + xb + xc) / 2;
		areaX = Math.sqrt(pX * (pX - xa) * (pX - xb) * (pX - xc));
		
		
		System.out.println("Enter the measures of triangle Y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();

		pY = (ya + yb + yc) / 2;
		areaY = Math.sqrt(pY * (pY - ya) * (pY - yb) * (pY - yc));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.print("Larger area: X");
		} else {
			System.out.print("Larger area: Y");
		}
	}

}
