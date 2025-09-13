package dia011.View;

import dia011.Control.*;
import dia011.Model.*;
import java.util.Scanner;

public class LoopView {
    Scanner scan = new Scanner(System.in);
    LoopControl LC = new LoopControl();
    LoopModel LM = new LoopModel();

    public void menu() {
        System.out.println(
                "Escolha o que fazer \n1: soma dos numeros usando for\n2: soma dos numeros usando while\n3: soma dos numeros usando do-while\n4: soma de numeros usando apenas pares\n5: encontrar um numero aleatorio divisivel por 5 e 7");
        escolha(scan.nextInt());
    }

    public void escolha(int escolha) {

        switch (escolha) {
            case 1:
                System.out.println("Escreva até qual numero a soma vai contar");
                LM.setN(scan.nextInt());
                System.out.print("a soma dos numeros de 1 até " + LM.getN() + "é : ");
                System.out.println(LC.somaFor(LM.getN()));
                break;
            case 2:
                System.out.println("Escreva até qual numero a soma vai contar");
                LM.setN(scan.nextInt());
                System.out.print("a soma dos numeros de 1 até " + LM.getN() + "é : ");
                System.out.println(LC.somaWhile(LM.getN()));
                break;
            case 3:
                System.out.println("Escreva até qual numero a soma vai contar");
                LM.setN(scan.nextInt());
                System.out.print("a soma dos numeros de 1 até " + LM.getN() + "é : ");
                System.out.println(LC.somaDoWhile(LM.getN()));
                break;
            case 4:
                System.out.println("Escreva até qual numero a soma vai contar");
                LM.setN(scan.nextInt());
                System.out.print("a soma dos numeros de 1 até " + LM.getN() + " pares é : ");
                System.out.println(LC.somaContinue(LM.getN()));
                break;
            case 5:
                System.out.print("o numero encontrado é : ");
                LC.rand100();
                break;

            default:
                System.err.println("opção invalida");
                break;
        }
    }
}