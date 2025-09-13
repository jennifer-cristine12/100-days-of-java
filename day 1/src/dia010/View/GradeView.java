package dia010.View;

import dia010.Control.*;
import dia010.Model.*;
import java.util.Scanner;

public class GradeView {
    GradeControl GC = new GradeControl();
    GradeModel GM = new GradeModel();
    Scanner scan = new Scanner(System.in);

   private String calcularGrade(int percentualNota) {
        if (percentualNota >= 90) {
            return "A";
        } else if (percentualNota < 90 && percentualNota >= 80) {
            return "B";
        } else if (percentualNota < 80 && percentualNota >= 70) {
            return "C";
        } else if (percentualNota < 70 && percentualNota >= 60) {
            return "D";
        }
        return "F";
    }

    public void letterGrade() {
        System.out.println("escreva o total de questões");
        GM.setQtdQuestoes(scan.nextInt());
        System.out.println("escreva a nota");
        GM.setNota(scan.nextInt());
        if (GM.getNota() > GM.getQtdQuestoes()) {
            System.err.println(
                    "a nota precisa ser menor ou igual que a quantidade de questões, escreva a nota novamente");
            GM.setNota(scan.nextInt());
        }
        String nota = "Nota "+calcularGrade(GC.percentualNota(GM.getNota(), GM.getQtdQuestoes()))+" ";
        switch (calcularGrade(GC.percentualNota(GM.getNota(), GM.getQtdQuestoes()))) {
            case "A":
                System.out.println(nota+" Passou, parabens");
                break;
            case "B":
                System.out.println(nota+"Nada mal, mais um pouco e pegava o A");
                break;
            case "C":
                System.out.println(nota+"Está na media");
                break;
            case "D":
                System.out.println(nota+"Precisa revisar");
                break;
            default:
            System.out.println(nota+"Falhou");
                break;
        }

    }
}
