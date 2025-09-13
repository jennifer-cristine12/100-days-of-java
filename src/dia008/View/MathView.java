package dia008.View;

import java.util.Scanner;
import dia008.controller.*;
import dia008.model.*;

public class MathView {

  public void menu() {
    Scanner scan = new Scanner(System.in);

    MathController MC = new MathController();
    MathModel MM = new MathModel();
    System.out.println(
        "escreva a operação\n1: máximo\n2: mínimo\n3: raiz quadrada\n4: arredondar para baixo \n5: arredondar para cima \n6: valor absoluto");
    int opt = scan.nextInt();
    switch (opt) {
      case 1:
        System.out.println("escreva os valores");
        MM.setNumero1(scan.nextInt());
        MM.setNumero2(scan.nextFloat());
        System.out.println("maior numero: " + MC.maximoNumero(MM.getNumero1(), MM.getNumero2()));
        break;
      case 2:
        System.out.println("escreva os valores");
        MM.setNumero1(scan.nextInt());
        MM.setNumero2(scan.nextFloat());
        System.out.println("menor número: " + MC.minimoNumero(MM.getNumero1(), MM.getNumero2()));
        break;
      case 3:
        System.out.println("escreva o valor");
        MM.setNumero1(scan.nextInt());
        System.out.println("raiz quadrada : " + MC.raizQuadrada(MM.getNumero1()));
        break;
      case 4:
        System.out.println("escreva o valor");
        MM.setNumero2(scan.nextFloat());
        System.out.println("número arredondado para baixo: " + MC.arredondaAbaixo(MM.getNumero2()));
        break;
      case 5:
        System.out.println("escreva o valor");
        MM.setNumero2(scan.nextFloat());
        System.out.println("número arredondado para cima: " + MC.arredondaAcima(MM.getNumero2()));
        break;
      case 6:
        System.out.println("escreva o valor");
        MM.setNumero2(scan.nextFloat());
        System.out.println("número absoluto: " + MC.valorAbsoluto(MM.getNumero2()));
        break;
      default:
        System.err.println("opção inválida");
        break;

    }

  }
}
