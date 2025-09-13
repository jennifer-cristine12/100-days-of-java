package dia005;

import java.util.Scanner;

import dia005.view.AreaTrianguloView;

public class MainArea {
    public static void main(String[] args) {
        AreaTrianguloView aView = new AreaTrianguloView();
        aView.calcular(new Scanner(System.in));
    }
}
