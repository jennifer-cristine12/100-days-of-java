package dia009.View;

import java.util.Scanner;
import dia009.Model.AnoBisextoModel;
import dia009.Control.AnoBisextoControl;

public class AnoBisextoView {
    Scanner scan = new Scanner(System.in);
    AnoBisextoControl ABC = new AnoBisextoControl();
    AnoBisextoModel ABM = new AnoBisextoModel();

    public void anoBisexto() {
        System.out.println("escreva o ano para ser calculado");
        ABM.setAno(scan.nextInt());
        if(ABC.isAnoBisexto(ABM.getAno())){
            System.out.println("o ano é bisexto");
        }
        else{
            System.out.println("o ano não é bisexto");
        }

    }
}
