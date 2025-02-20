package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor;
		int cod = sc.nextInt();
		int quant = sc.nextInt();

		if (cod == 1) {
			valor = quant * 4.0;
		} else if (cod == 2) {
			valor = quant * 4.5;
		} else if (cod == 3) {
			valor = quant * 5.0;
		} else if (cod == 4) {
			valor = quant * 2.0;
		} else {
			valor = quant * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", valor);

		sc.close();
		// Ler código de produto, quantidade, calcular e mostrar valor a pagar.

	}

}
