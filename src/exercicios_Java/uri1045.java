package exercicios_Java;

import java.util.*;

public class uri1045 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        List<Double> lista = Arrays.asList(x, y, z);
        Collections.sort(lista, Collections.reverseOrder());
        double A = lista.get(0);
        double B = lista.get(1);
        double C = lista.get(2);

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (A*A == B*B + C*C) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (A*A > B*B + C*C){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A == B && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }


        sc.close();

    }
}
