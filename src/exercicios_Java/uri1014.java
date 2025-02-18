package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int km = sc.nextInt();
		double litros = sc.nextDouble();
		double media;

		media = km / litros;

		System.out.printf("%.3f km/l%n", media);

		sc.close();

	}

}
//cálculo de consumo de combustível