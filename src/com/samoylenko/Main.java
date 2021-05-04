
//        2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со следующими изменениями:
//        - если число кратно 3 то вывести вместо него Hello
//        - если число кратно 5 то вывести вместо него World
//        - если число кратно и 3 и 5 то вывести вместо него HelloWorld
//        3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве. Входящие параметры: массив и число.
//        (считаем что массива который нам передали отсортирован, проверять это не нужно)
package com.samoylenko;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
    }

    //        1) В банк положили S денег. Какой станет сумма вклада через N лет,
    //        если процент 1,5% добавляется к сумме вклада ежемесячно.
    public static void task1() {
        System.out.println("Enter the deposit amount");
        double depositAmount = SCANNER.nextInt();
        System.out.println("For how many years will you make the deposit?");
        int month  = SCANNER.nextInt() * 12;
        double monthlyIncome = 0.0;
        for (int i = 0; i < month; i++) {
            monthlyIncome = (depositAmount / 100) * 1.5;
            depositAmount += monthlyIncome;
        }
        String finalResult =  new DecimalFormat("#0.00").format(depositAmount);
        System.out.println("For " + month + " month you'll get " + finalResult);
    }
}
