package exercicios_Java;

import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior;

		maior = Math.max(a, Math.max(b, c));

		System.out.println(maior + " eh o maior");

		sc.close();
		// Ler três valores e apresentar o maior entre eles.

	}

}
