package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int raio = sc.nextInt();
		double pi = 3.14159;
		double volume;

		volume = 4.0 / 3.0 * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
		// Calcular e mostrar volume de uma esfera
	}

}
