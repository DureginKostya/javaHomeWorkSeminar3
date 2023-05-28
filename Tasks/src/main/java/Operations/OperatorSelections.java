package Operations;

import Validations.ValidationsValues;
import java.util.ArrayList;
import java.util.List;

public class OperatorSelections {
    public void menu() {
        ValidationsValues vV = new ValidationsValues();
        InputOutputValues iOValues = new InputOutputValues();
        ArithmeticOperations aO = new ArithmeticOperations();
        boolean flag = true;
        String userOperator;
        int range, lenList;
        List<Integer> rNList = new ArrayList<>();
        while (flag) {
            System.out.println();
            printHint();
            userOperator = vV.validationEnterOperator();
            switch (userOperator) {
                case "c" -> {
                    range = iOValues.getUserRangeList();
                    rNList = iOValues.getRandomNumberList(range);
                    iOValues.printArray("Список: ", rNList);
                }
                case "d" -> {
                    if (vV.validationListNull(rNList)) {
                        lenList = rNList.size();
                        iOValues.printArray("Исходный список: ", rNList);
                        rNList = aO.deleteEvenNumbers(rNList);
                        if (lenList != rNList.size()) {
                            System.out.println("Удалены чётные числа из списка");
                            iOValues.printArray("Новый список: ", rNList);
                        } else System.out.println("В списке нет чётных чисел");
                    }
                }
                case "fmin" -> {
                    if (vV.validationListNull(rNList)) {
                        iOValues.printArray("Список: ", rNList);
                        System.out.printf("Минимальное значение в списке: %d\n", aO.getMinimalValue(rNList));
                    }
                }
                case "fmax" -> {
                    if (vV.validationListNull(rNList)) {
                        iOValues.printArray("Список: ", rNList);
                        System.out.printf("Максимальное значение в списке: %d\n", aO.getMaximumValue(rNList));
                    }
                }
                case "fmid" -> {
                    if (vV.validationListNull(rNList)) {
                        iOValues.printArray("Список: ", rNList);
                        System.out.printf("Максимальное значение в списке: %.3f\n", aO.getMiddleValue(rNList));
                    }
                }
                case "e" -> flag = false;
            }
        }
    }
    public void printHint() {
        String msg = new StringBuilder()
                .append("Введите одно из действий:\n")
                .append("1. Создать список - << c >>\n")
                .append("2. Удалить четные числа из списка - << d >>\n")
                .append("3. Найти минимальное значение в списке - << fmin >>\n")
                .append("4. Найти максимальное значение в списке - << fmax >>\n")
                .append("5. Найти среднее арифметическое значение списка - << fmid >>\n")
                .append("6. Выйти - << e >>")
                .toString();
        System.out.println(msg);
    }
}
