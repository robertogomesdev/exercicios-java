package exercicios_Java;

import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int resto, horas, minutos, segundos;

		horas = N / 3600;
		resto = N % 3600;
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);
		sc.close();
		//Conversão de tempo.

	}

}
