package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		//Exercício só pediu para ler o nome, por isso a variável não foi usada
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		double comissão = 15.0 / 100.0;
		double total;

		total = salario + (comissão * vendas);

		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
		// Cálculo de salário com bônus
	}

}
