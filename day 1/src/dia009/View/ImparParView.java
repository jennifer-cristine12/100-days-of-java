package dia009.View;

import dia009.Control.*;
import dia009.Model.*;
import java.util.Scanner;;

public class ImparParView {
    public void imparOuPar() {
        ImparParModel POIM = new ImparParModel();
        ImparParControl POIC = new ImparParControl();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o número");
        POIM.setNumero(scan.nextInt());
        System.out.println("o número é " +
                POIC.imparOuPar(POIC.isPar(POIM.getNumero())));
    }
}
