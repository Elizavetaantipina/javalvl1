package geekbrainshomework3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Написать программу, которая загадывает случайное число от 0 до 9,
        // и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
        // должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        // 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        System.out.println("У Вас есть 3 попытки, чтобы угадать число от 0 до 9.");
        int range = 9;
        int rand = (int) (Math.random() * range);
        int b = 1;
        while (b == 1) {
            igra(range, rand);
            System.out.println("Повторить игру еще раз? 1 - да; 0 - нет.");
            b = sc.nextInt();
        }
    }
    private static void igra(int range, int rand) {
        for (int i = 1; i < 4; i++) {
            System.out.println("Попытка № " + i);
            System.out.println("Введите число от 0 до " + range);
            int imnumb = sc.nextInt();
            if (imnumb == rand) {
                System.out.println("Верно! Вы угадали.");
            } else if (imnumb > rand) {
                System.out.println("Указанное Вами число больше.");
            } else {
                System.out.println("Указанное Вами число меньше");
            }
        }
    }
}
