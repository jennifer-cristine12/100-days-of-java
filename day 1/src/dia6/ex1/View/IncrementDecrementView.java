package dia6.ex1.View;

import dia6.ex1.controle.*;
import dia6.ex1.Model.*;
import java.util.Scanner;

public class IncrementDecrementView {
    IncrementDecrementControl IDC = new IncrementDecrementControl();
    IncrementDecrementModel IDM = new IncrementDecrementModel();

    public String opcoes(int opcao) {
        Scanner scan = new Scanner(System.in);
        switch (opcao) {
            case 1:
                System.out.println("Escreva o numero para incrementar");
                IDM.setNumIncrement(scan.nextInt());
                return "" + IDC.Increment(IDM.getNumIncrement());
            case 2:
                System.out.println("Escreva o numero para decrementar");
                IDM.setNumDecrement(scan.nextInt());
                return "" + IDC.Increment(IDM.getNumDecrement());
            case 3:
                System.out.println("para parar o timer digite ctrl+c");
                IDC.StopWatch();
                return "";
            case 4:
                System.out.println("Escreva quantos minutos para contar");
                IDM.setMinutes(scan.nextInt());
                IDC.Timer(IDM.getMinutes());
                return "";
            case 5:
                System.out.println("escreva o numero e o multiplicador");
                IDM.setNumMultiplicador(scan.nextInt());
                IDM.setMultiplicador(scan.nextInt());
                System.out.println("o resultado é: "+IDC.multiplicador(IDM.getNumMultiplicador(),IDM.getMultiplicador()));
                return "";
            default:
                System.err.println("opção invalida");
                return "";
        }
    }

    public void operar(Scanner scan) {
        System.out.println(
                "qual é a operação desejada:\n1 : incrementar\n2 : decrementar\n3: cronometro\n4: temporizador\n5: multiplicador\n6: binario \n7: divisor");
        System.out.println(opcoes(scan.nextInt()));

    }

}
