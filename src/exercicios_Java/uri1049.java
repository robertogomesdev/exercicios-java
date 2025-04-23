package exercicios_Java;

import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        String chave = palavra1 + "-" + palavra2 + "-" + palavra3;

        switch (chave){
            case "vertebrado-mamifero-onivoro":
                System.out.println("homem");
                break;
            case "vertebrado-mamifero-herbivoro":
                System.out.println("vaca");
                break;
            case "vertebrado-ave-carnivoro":
                System.out.println("aguia");
                break;
            case "vertebrado-ave-onivoro":
                System.out.println("pomba");
                break;
            case "invertebrado-inseto-hematofago":
                System.out.println("pulga");
                break;
            case "invertebrado-inseto-herbivoro":
                System.out.println("lagarta");
                break;
            case "invertebrado-anelideo-hematofago":
                System.out.println("sanguessuga");
                break;
            case "invertebrado-anelideo-onivoro":
                System.out.println("minhoca");
                break;
        }

        sc.close();

    }
}
