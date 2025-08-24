package dia9.View;

import java.util.Scanner;

import dia9.Control.SortTresControl;
import dia9.Model.SortTresModel;

public class SortTresView {
    public void AcharMaior() {
        Scanner scan = new Scanner(System.in);
        SortTresModel STM = new SortTresModel();
        SortTresControl STC = new SortTresControl();
        System.out.println("escreva três números");
        STM.setNum1(scan.nextInt());
        STM.setNum2(scan.nextInt());
        STM.setNum3(scan.nextInt());
        System.out.println("o maior número entre os três é: " +
                STC.lastSort(STM.getNum1(), STM.getNum2(), STM.getNum3()));
    }

}
