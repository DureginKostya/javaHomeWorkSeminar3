package Operations;

import Validations.ValidationsValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InputOutputValues {
    public int getUserRangeList() {
        ValidationsValues vV = new ValidationsValues();
        return vV.validationEnterNumber();
    }
    public List<Integer> getRandomNumberList(int n) {
        Random random = new Random();
        List<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomArray.add(random.nextInt(20));
        }
        return randomArray;
    }
    public void printArray(String msg, List<Integer> array) {
        System.out.print(msg);
        System.out.println(array);
    }
}
