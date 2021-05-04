package com.samoylenko;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    //        1) В банк положили S денег. Какой станет сумма вклада через N лет,
    //        если процент 1,5% добавляется к сумме вклада ежемесячно.
    public static void task1() {
        System.out.println("Enter the deposit amount");
        double depositAmount = SCANNER.nextInt();
        System.out.println("For how many years will you make the deposit?");
        int month = SCANNER.nextInt() * 12;
        double monthlyIncome = 0.0;
        for (int i = 0; i < month; i++) {
            monthlyIncome = (depositAmount / 100) * 1.5;
            depositAmount += monthlyIncome;
        }
        String finalResult = new DecimalFormat("#0.00").format(depositAmount);
        System.out.println("For " + month + " month you'll get " + finalResult);
    }

    //        2) Реализовать метод который вернет строку String, в которой
//        через пробел все числа от 1 до 99 со следующими изменениями:
//        - если число кратно 3 то вывести вместо него Hello
//        - если число кратно 5 то вывести вместо него World
//        - если число кратно и 3 и 5 то вывести вместо него HelloWorld
    public static void task2() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 99; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                s.append(" HelloWorld");
            } else if (i % 3 == 0) {
                s.append(" Hello");
            } else if ((i % 5) == 0) {
                s.append(" World");
            } else
                s.append(" " + i);

        }
        System.out.println(s);
    }

    //        3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
//        Входящие параметры: массив и число.
//        (считаем что массива который нам передали отсортирован, проверять это не нужно)
    public static void task3() {
        int[] sortArray = {1, 2, 2, 4, 5, 6, 6, 7, 7, 7, 9, 10, 10, 11, 13, 14, 17};
        System.out.println(Arrays.toString(sortArray));
        System.out.println("Enter the number for binary search");
        int requiredNumber = SCANNER.nextInt();
        if (binarySearch(sortArray, requiredNumber)) {
            System.out.println("The array contains " + requiredNumber);
        } else {
            System.out.println(requiredNumber + " does not belong to array");
        }
    }

    public static boolean binarySearch(int[] arr, int number) {
        int leftBorder = 0;
        int rightBorder = arr.length;
        int mid;
        for (int i = 0; i < arr.length; i++) {
            if (arr[mid = (leftBorder + rightBorder) / 2] == number) {
                return true;
            } else if (arr[mid = (leftBorder + rightBorder) / 2] < number) {
                leftBorder = mid;
            } else if (arr[mid = (leftBorder + rightBorder) / 2] > number) {
                rightBorder = mid;
            } else {
                break;
            }
        }
        return false;
    }
}

