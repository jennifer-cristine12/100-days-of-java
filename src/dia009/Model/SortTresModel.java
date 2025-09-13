package dia009.Model;

public class SortTresModel {
    private int numeros[] = new int[3];

    public void setNum1(int num) {
        numeros[0] = num;
    }

    public void setNum2(int num) {
        numeros[1] = num;
    }

    public void setNum3(int num) {
        numeros[2] = num;
    }

    public int getNum1() {
        return numeros[0];
    }

    public int getNum2() {
        return numeros[1];
    }

    public int getNum3() {
        return numeros[2];
    }

}
