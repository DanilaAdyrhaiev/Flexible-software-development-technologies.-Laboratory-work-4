package org.nau.task5_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            num++; // збільшуємо непарне число на 1, щоб отримати наступне парне
        }

        System.out.println("Квадрати парних чисел, починаючи з " + num + ":");
        for (int i = num; i <= num + 10; i += 2) { // виводимо квадрати 5 парних чисел
            System.out.println("Квадрат " + i + " = " + (i * i));
        }
    }
}
