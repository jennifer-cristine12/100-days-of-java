package dia007.View;

import java.util.Scanner;
import dia007.Control.*;
import dia007.Model.*;

public class ConverterView {
    Scanner scan = new Scanner(System.in);

    public void options(String opt) {
        ConverterModel CM = new ConverterModel();
        ConverterControle CC = new ConverterControle();

        switch (opt) {
            case "2":
                System.out.println("escreva o numero");
                CM.setIntValor(scan.nextInt());
                CC.ConversorValueOfString(CM.getIntValor());
                break;

            case "1":
                System.out.println("escreva o numero");
                CM.setStrValor(scan.nextLine());
                try {
                    CC.conversorInt(CM.getStrValor());
                } catch (Exception e) {
                    System.err.println("Numero invalido, apenas numeros");
                }
                break;
            default:
                System.err.println("opção invalida");
                break;
        }
    }

    public void Converter() {

        System.out.println(
                "deseja converter uma String para numero ou um numero para String\n1: Numero para string\n2: String para numero");

        options(scan.nextLine());
    }
}
