package dia5.view;

import java.util.Scanner;

import dia5.controle.AreaTrianguloControle;
import dia5.modelo.AreaTrianguloModelo;

public class AreaTrianguloView {
    public void calcular(Scanner sc){
        AreaTrianguloModelo a = new AreaTrianguloModelo();
        AreaTrianguloControle ac = new AreaTrianguloControle();
        System.out.println("Escreva a base do triangulo");
        a.setBase(sc.nextInt());
        System.out.println("Escreva a altura do triangulo");
        a.setAltura(sc.nextInt());

        System.out.println("area do triangulo: "+ac.area(a.getBase(), a.getAltura()));
    }
}
