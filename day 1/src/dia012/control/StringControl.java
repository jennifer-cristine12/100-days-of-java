package dia012.control;

import java.util.Arrays;

public class StringControl {
    public int strLength(String str) {
        return str.length();
    }

    public String strConcat(String a, String b) {
        return a + b;
    }

    public boolean strEquals(String a, String b) {
        return a.equals(b);
    }

    public String upLow(String str, int operation) {
        if (operation == 1) {
            return str.toUpperCase();
        }
        return str.toLowerCase();
    }

    public String strTrim(String str) {
        return str.strip();
    }

    public String strExtract(String str, int begin, int end) {
        return str.substring(begin, end);
    }

    public String strSplit(String str) {
        
        return Arrays.toString(str.split(" "));
    }

    public String strReversal(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public boolean busca(String str, String subStr) {
        return str.contains(subStr);
    }
}
