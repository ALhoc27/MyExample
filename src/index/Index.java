package index;

import static java.lang.Math.abs;
import static java.lang.System.arraycopy;

public class Index {

    public static int[] index (int[] inArray) {
        int[] result = new int[inArray.length];
        int j, resj = inArray.length-1;
        int i = 0;
        j = resj;
            while (i != j || inArray[i] < 0) {
//                if (inArray[i] >= 0) {
//                    arraycopy(inArray, inArray.length-resj, result, 0, resj);
//                    return result;
//                }
                if (abs(inArray[i]) >= inArray[j]) {
                    result[resj--] = inArray[i] * inArray[i];
                    i++;
                } else {
                    result[resj--] = inArray[j] * inArray[j];
                    j--;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        int[] inArray = {-20, -17, -15, -10, -3, 0, 1, 3, 5, 7};
        int[] rezArray = index(inArray);
        for (int el:rezArray) {
            System.out.print(" " + el);
        };
    }
}

