import static java.lang.Math.abs;
import static java.lang.System.arraycopy;

public class Index {

    public int[] index (int[] inArray) {
        int[] result = new int[inArray.length];
        int j, resj = inArray.length;
        int i = 0;
        j = resj;
            while (i == j || inArray[i] < 0) {
                if (inArray[i] >= 0) {
                    arraycopy(inArray, 0, result, 0, inArray.length-resj);
                    return result;
                }
                if (abs(inArray[i]) >= inArray[j-1]) {
                    result[resj--] = inArray[i] * inArray[i];
                    i++;
                } else {
                    result[resj--] = inArray[j] * inArray[j];
                    j--;
                }
            }
        return result;
    }
}

