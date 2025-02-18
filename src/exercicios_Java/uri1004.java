package exercicios_Java;

import java.util.Scanner;

public class uri1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, PROD;
		a = sc.nextInt();
		b = sc.nextInt();

		PROD = a * b;

		System.out.println("PROD = " + PROD);

		sc.close();
	}
	// produto de dois valores

}
