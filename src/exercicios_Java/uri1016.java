package exercicios_Java;

import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int distancia;

		distancia = y * 2;

		System.out.println(distancia + " minutos");

		sc.close();

	}

}
//Ler distância em km
//calcular quanto tempo carro Y leva pra tomar distância de outro carro
//como base sabemos que carro y consegue se afasta a cada 2min