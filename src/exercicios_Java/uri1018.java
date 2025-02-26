package exercicios_Java;

import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		System.out.println(valor);
		
		int notasDe100 = valor / 100;
		valor = valor % 100;
		int notasDe50 = valor /50;
		valor = valor % 50;
		int notasDe20 = valor / 20;
		valor = valor % 20;
		int notasDe10 = valor / 10;
		valor = valor % 10;
		int notasDe5 = valor / 5;
		valor = valor % 5;
		int notasDe2 = valor / 2;
		valor = valor % 2;
		int notasDe1 = valor / 1;
		valor = valor % 1;
		
		
		System.out.println(notasDe100 + " nota(s) de R$ 100,00");
		System.out.println(notasDe50 + " nota(s) de R$ 50,00");
		System.out.println(notasDe20 + " nota(s) de R$ 20,00");
		System.out.println(notasDe10 + " nota(s) de R$ 10,00");
		System.out.println(notasDe5 + " nota(s) de R$ 5,00");
		System.out.println(notasDe2 + " nota(s) de R$ 2,00");
		System.out.println(notasDe1 + " nota(s) de R$ 1,00");
		
		sc.close();

	}

}
