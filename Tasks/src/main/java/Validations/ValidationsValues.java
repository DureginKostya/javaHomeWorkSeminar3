package Validations;

import Operations.OperatorSelections;
import java.util.List;
import java.util.Scanner;

public class ValidationsValues {
    Scanner scanner = new Scanner(System.in);
    boolean flag;
    public int validationEnterNumber() {
        System.out.print("Введите размерность списка: ");
        String userRange = scanner.next();
        int enterRange = 0;
        flag = true;
        while (flag) {
            try {
                enterRange = Integer.parseInt(userRange);
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Введено не целочисленное значение!!!");
                System.out.print("Введите размерность списка повторно: ");
                userRange = scanner.next();
            }
        }
        return enterRange;
    }
    public String validationEnterOperator() {
        System.out.print("Выполнить: ");
        String operator = scanner.next().trim();
        OperatorSelections oS = new OperatorSelections();
        String enterOperator = " ";
        flag = true;
        while (flag) {
            if ((operator.equals("c")) || (operator.equals("d")) || (operator.equals("fmin")) || (operator.equals("fmax")) || (operator.equals("fmid")) || (operator.equals("e"))) {
                enterOperator = operator;
                flag = false;
            } else {
                System.out.println("!!! Введен неправильный оператор, пожалуйста повторите ввод !!!");
                System.out.println();
                oS.printHint();
                System.out.print("Выполнить: ");
                operator = scanner.next().trim();
            }
        }
        return enterOperator;
    }
    public boolean validationListNull(List<Integer> array) {
        if (array.size() > 0) return true;
        else {
            System.out.println("Список пустой!!! Создайте список!!!");
            return false;
        }
    }
}
