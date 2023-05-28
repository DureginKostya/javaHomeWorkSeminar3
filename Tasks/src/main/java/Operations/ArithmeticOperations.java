package Operations;

import java.util.Collections;
import java.util.List;

public class ArithmeticOperations {
    public List<Integer> deleteEvenNumbers(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(array.get(i));
                i--;
            }
        }
        return array;
    }
    public int getMinimalValue(List<Integer> array) {
        return Collections.min(array);
    }
    public int getMaximumValue(List<Integer> array) {
        return Collections.max(array);
    }
    public double getMiddleValue(List<Integer> array) {
        int sumNumber = 0;
        for (Integer integer : array) {
            sumNumber += integer;
        }
        return (double) sumNumber / array.size();
    }
}
