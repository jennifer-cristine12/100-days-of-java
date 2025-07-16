package dia4.view;

import java.util.Scanner;

import dia4.controle.CalculadoraControle;
import dia4.modelo.CalculadoraModelo;

public class Imprime {
    void imprime(){
        CalculadoraControle calculadoraControle = new CalculadoraControle();
        CalculadoraModelo calculadoraModelo = new CalculadoraModelo();
        Scanner sc = new Scanner(System.in);
        int operacao;
        System.out.println("digite a operação\n1: soma\n2: subtração\n3: multiplicaçao\n4:divisão");
        operacao = sc.nextInt();
        System.out.println("digite o primeiro numero");
            calculadoraModelo.setNum1(sc.nextInt());
            System.out.println("digite o segundo numero");
            calculadoraModelo.setNum2(sc.nextInt());
        switch (operacao) {
            case 1:
            System.out.println("operação: soma");
            System.out.println("resultado: "+calculadoraControle.soma(calculadoraModelo.getNum1(), calculadoraModelo.getNum2()));
            break;
            case 2:
            System.out.println("operação: subtracao");
            System.out.println("resultado: "+calculadoraControle.subtrai(calculadoraModelo.getNum1(), calculadoraModelo.getNum2()));
            break;
            case 3:
            System.out.println("operação: mltiplicacaão");
            System.out.println("resultado: "+calculadoraControle.multiplica(calculadoraModelo.getNum1(), calculadoraModelo.getNum2()));
            break;
            case 4:
            System.out.println("operação: divisão");
            System.out.println("resultado: "+calculadoraControle.divide(calculadoraModelo.getNum1(), calculadoraModelo.getNum2()));
            break;
            default:
            System.out.println("operacaoInvalida");
            break;
}
    }
}
