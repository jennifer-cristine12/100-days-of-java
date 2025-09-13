package dia007.Control;

public class ConverterControle {
   
    public void conversorInt(String num) {
        try {
            System.out.println(Integer.parseInt(num));
        } catch (Exception e) {
            System.err.println("Numero invalido, apenas numeros");
        }

    }

    public void conversorFloat(String num) {
        try {
            System.out.println(Double.parseDouble(num));
        } catch (Exception e) {
            System.err.println("Numero invalido, apenas numeros");
        }

    }

    public String ConversorToString(String num) {
        return num.toString();
    }
    public String ConversorValueOfString(int num) {
        return String.valueOf(num);
    }
}
