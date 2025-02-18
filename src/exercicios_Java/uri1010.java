package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qtde1, qtde2;
		double preco1, preco2, valor;

		cod1 = sc.nextInt();
		qtde1 = sc.nextInt();
		preco1 = sc.nextDouble();

		cod2 = sc.nextInt();
		qtde2 = sc.nextInt();
		preco2 = sc.nextDouble();

		valor = preco1 * qtde1 + preco2 * qtde2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);

		sc.close();

	}

}
//calculo de total a pagar por um produto