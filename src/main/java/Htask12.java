/*
Задача №2
 Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5
 */


import java.util.Scanner;


public class Htask12 {
    public static void main(String[] args) {
        System.out.printf("Сумма положительных чисел, стоящих перед отрицательными числами равна: %d", getSum(0));
    }
    public static int getSum(int positiveNumberSum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые числа, чередуя отрицательные и положительные ЧЕРЕЗ ПРОБЕЛ!!! После заполнения введите 0 и нажмите enter: ");
        int num = scanner.nextInt();

        do {
            int nextNum = scanner.nextInt();
            if (num > 0 && nextNum < 0) {
                positiveNumberSum += num;
            }
            num = nextNum;
        } while (num != 0);

        return positiveNumberSum;
    }
}
