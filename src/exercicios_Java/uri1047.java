package exercicios_Java;

import java.util.Scanner;

public class uri1047 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int minutosIniciais = horaInicial * 60 + minutoInicial;
        int minutosFinais = horaFinal * 60 + minutoFinal;

        int duracao;

        if (minutosIniciais < minutosFinais){
            duracao = minutosFinais - minutosIniciais;
        }
        else {
            duracao = (24 * 60 - minutosIniciais) + minutosFinais;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();
    }
}
