package HW4_Loop1;

public class Main {
    public static void main(String[] args) {
        /*Задача 1
        С помощью цикла for выведите в консоль все целые числа от 1 до 10.
         */
        System.out.println("Задача 1");

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 2
        С помощью цикла for выведите в консоль все целые числа от 10 до 1.
        */
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 3
        Выведите в консоль все четные числа от 0 до 17.
        */
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i+=2){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 4
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        */
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 5
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
        */
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i+= 4){
            //для диапазона 1904 - 2096 условие избыточное, но оставлю его здесь
            if (i % 100 != 0 || i % 400 == 0){
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println();


        /*Задача 6
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
        */
        System.out.println("Задача 6");

        for (int i = 7; i < 100; i += 7){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 7
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512
        */
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        System.out.println();


        /*Задача 8
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать
        по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
        */
        System.out.println("Задача 8");

        int salary = 29000;
        int deposit = 0;

        for (int i = 1; i <= 12; i++){
            deposit += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit);
        }

        System.out.println();


        /*Задача 9
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
        а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
        */
        System.out.println("Задача 9");

        int salary9 = 29000;
        int deposit9 = 0;

        for (int i = 1; i <= 12; i++){
            deposit9 += deposit9/100;
            deposit9 += salary9;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit9);
        }

        System.out.println();


        /*Задача 10
        Напишите программу, которая выводит в консоль таблицу умножения на 2:
        */
        System.out.println("Задача 10");

        int number = 2;

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }
}
