package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public int Check_num(int num_hum) {
        Scanner in = new Scanner(System.in);
        while ( num_hum >3 || num_hum<1 ) {
            System.out.println("Вы ввели некорректное число. Введите число от 1 до 3: ");
            num_hum = in.nextInt();
        }
        return num_hum;
    }

    public static void main(String[] args) {

        int matches = 20;
        int num_comp = 0;
        Scanner in = new Scanner(System.in);
        Main Ran = new Main();
        Main Check = new Main();
        System.out.println("Начинается игра 20 спичек!");
        System.out.println("На столе " + matches + " спичек.");
        matches = matches - 3;
        System.out.println("Ход компьютера. Колличество отнятых спичек: 3");
        while ( matches > 2) {

            switch (matches) {
                case 16:
                    matches = matches -3;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 3");
                    break;
                case 15:
                    matches = matches -2;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 2");
                    break;
                case 14:
                    matches = matches -1;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 1");
                    break;
                case 12:
                    matches = matches -3;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 3");
                    break;
                case 11:
                    matches = matches -2;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 2");
                    break;
                case 10:
                    matches = matches -1;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 1");
                    break;

                case 8:
                    matches = matches - 3;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 3");
                    break;
                case 7:
                    matches = matches - 2;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 2");
                    break;
                case 6:
                    matches = matches - 1;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 1");
                    break;
                case 4:
                    matches = matches - 3;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 3");
                    break;
                case 3:
                    matches = matches - 2;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 2");
                    break;
                case 2:
                    matches = matches - 1;
                    System.out.println("Ход компьютера. Колличество отнятых спичек: 1");
                    break;
            }

            if (matches >1) {
                System.out.println("Осталось спичек: " + matches);
                System.out.print("Ход игрока. Колличество отнятых спичек: ");
                int num_hum = in.nextInt();
                num_hum = Check.Check_num(num_hum);
                matches = matches - num_hum;
                System.out.println("Осталось спичек: " + matches);
            }
            else {
                System.out.println("Осталось спичек: " + matches);
                System.out.println("Компьютер одержал победу! Вы проиграли");
            }

        }
    }
}
