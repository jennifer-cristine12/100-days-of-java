package dia9.Control;

public class AnoBisextoControl {
    public boolean isAnoBisexto(int ano) {
        return ano % 4 == 0 && ano %100!=0 || ano % 4 == 0 && ano%100==0 && ano%400==0;

    }
}
