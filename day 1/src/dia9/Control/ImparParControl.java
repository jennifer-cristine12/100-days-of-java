package dia9.Control;

public class ImparParControl {
    public boolean isPar(int num) {
        return num % 2 == 0;
    }

    public String imparOuPar(boolean res) {
        if (res) {
            return "par";
        }
        return "ímpar";
    }

}
