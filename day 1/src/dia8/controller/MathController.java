package dia8.controller;

public class MathController {
    public float maximoNumero(float num1, float num2) {
        return Math.max(num1, num2);
    }

    public float minimoNumero(float num1, float num2) {
        return Math.min(num1, num2);
    }

    public float raizQuadrada(int num) {
        return (float) Math.sqrt(num);
    }

    public int arredondaAcima(float num) {
        return (int)Math.ceil(num);
    }

    public int arredondaAbaixo(float num) {
        return (int)Math.floor(num);
    }

    public int valorAbsoluto(float num) {
        return (int) Math.abs(num);
    }

}
