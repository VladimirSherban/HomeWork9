package com.SkyPro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("\nЗадача_1");
        int[] spending = generateRandomArray();
        int sum = 0;

        for (int spend : spending) {
            sum += spend;
        }
        System.out.println(Arrays.toString(spending));
        System.out.println("Сумма затрат за месяц составила : " + sum);
    }

    public static void task2() {
        System.out.println("\nЗадача_2");
        int[] spending = generateRandomArray();
        int max = spending[0];
        int min = spending[0];

        for (int spend : spending) {
            if (max < spend) {
                max = spend;
            }
        }
        for (int spend : spending) {
            if (min > spend) {
                min = spend;
            }
        }
        System.out.println(Arrays.toString(spending));
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей");
    }

    public static void task3() {
        System.out.println("\nЗадача_3");
        int[] spending = generateRandomArray();
        int sum = 0;

        for (int spend : spending) {
            sum += spend;
        }
        sum = sum / spending.length;

        System.out.println(Arrays.toString(spending));
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task4() {
        System.out.println("\nЗадача_4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
