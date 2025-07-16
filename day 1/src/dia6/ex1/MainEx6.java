package dia6.ex1;

import java.util.Scanner;
import dia6.ex1.controle.*;
import dia6.ex1.View.*;

public class MainEx6 {
    public static void main(String args[]) {
        IncrementDecrementControl IDC = new IncrementDecrementControl();
        
      IncrementDecrementView IDV = new IncrementDecrementView();
         IDV.operar(new Scanner(System.in));
         
    }
}
