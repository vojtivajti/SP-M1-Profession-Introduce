package HW6_Arrays1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
        Объявите три массива:
        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        Массив сразу заполните значениями.
        Произвольный массив. Тип и количество данных определите сами.
        Самостоятельно выберите способ создания массива:
        с помощью ключевого слова или сразу заполненный элементами.
         */
        System.out.println("Задание 1");

        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;

        float[] floatArr = {1.57f, 7.654f, 9.986f};
        boolean[] boolArr = {false, true};

        System.out.println();


        /*
        Задание 2
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.
         */
        System.out.println("Задание 2");

        for (int i = 0; i < intArr.length; i++){
            if (i == intArr.length - 1){
                System.out.print(intArr[i]);
                break;
            }
            System.out.print(intArr[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < floatArr.length; i++){
            if (i == floatArr.length - 1){
                System.out.print(floatArr[i]);
                break;
            }
            System.out.print(floatArr[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < boolArr.length; i++){
            if (i == boolArr.length - 1){
                System.out.print(boolArr[i]);
                break;
            }
            System.out.print(boolArr[i] + ", ");
        }

        System.out.println();
        System.out.println();


        /*
        Задание 3
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
         */
        System.out.println("Задание 3");

        for (int i = intArr.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(intArr[i]);
                break;
            }
            System.out.print(intArr[i] + ", ");
        }
        System.out.println();

        for (int i = floatArr.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(floatArr[i]);
                break;
            }
            System.out.print(floatArr[i] + ", ");
        }
        System.out.println();

        for (int i = boolArr.length - 1; i >=0; i--){
            if (i == 0){
                System.out.print(boolArr[i]);
                break;
            }
            System.out.print(boolArr[i] + ", ");
        }
        System.out.println();
        System.out.println();


        /*
        Задание 4
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом,
        поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.
         */
        System.out.println("Задание 4");

        for (int i =0; i < intArr.length; i++){
            if (intArr[i] % 2 != 0){
                intArr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
