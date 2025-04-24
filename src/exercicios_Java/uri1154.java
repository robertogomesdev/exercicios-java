package exercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma =0;
        int cont = 0;

        while ( N >= 0 ){
            soma += N;
            cont += 1;

            N = sc.nextInt();
        }

        double media;
        media = (double) soma /cont;

        System.out.printf("%.2f%n" , media);

        sc.close();

    }
}
