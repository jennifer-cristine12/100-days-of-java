package dia5;

import java.util.Scanner;

import dia5.view.AreaTrianguloView;

public class MainArea {
    public static void main(String[] args) {
        AreaTrianguloView aView = new AreaTrianguloView();
        aView.calcular(new Scanner(System.in));
    }
}
