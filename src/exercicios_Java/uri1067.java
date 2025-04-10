package exercicios_Java;

import java.util.Scanner;

public class uri1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
// Mostrar os números impares de 1 até variável x
// mostrar um valor por linha 