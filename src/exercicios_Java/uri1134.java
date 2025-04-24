package exercicios_Java;

import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codCombustivel = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codCombustivel != 4) {
            if (codCombustivel == 1) {
                alcool += 1;
            } else if (codCombustivel == 2) {
                gasolina += 1;
            } else if (codCombustivel == 3) {
                diesel += 1;
            }

            codCombustivel = sc.nextInt();
        }


        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
