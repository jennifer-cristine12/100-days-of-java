package dia009.Control;

import java.util.Arrays;

public class SortTresControl {
    public int lastSort(int num1, int num2, int num3) {
        int[] arr = { num1, num2, num3 };
        Arrays.sort(arr);
        return arr[2];
    }

}
