package dia003;

import java.util.Scanner;

import dia003.Modelo.Modelo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Modelo aparelho = new Modelo();
        System.out.println("escreva o nome do aparelho");
        aparelho.setNomeAparelho(sc.nextLine());
        System.out.println("escreva o preço do aparelho");
        aparelho.setPreco(sc.nextDouble());
        System.out.println("escreva a potencia do aparelho");
        aparelho.setPotencia(sc.nextInt());

        System.out.println("aparelho cadastrado com sucesso");
        System.out.println(aparelho.getNomeAparelho()+"\nR$"+aparelho.getPreco()+"\n"+aparelho.getPotencia()+"W");

    }
}
