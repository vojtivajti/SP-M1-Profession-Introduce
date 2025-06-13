package HW9_Methods;

import java.time.LocalDate;

public class Main {
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void determinateVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void detrminateDeliveryDays(int deliveryDistance){
        int defaultDeliveryTime = 1;
        if (deliveryDistance <= 100){
            if (deliveryDistance <= 20){
                System.out.println("Потребуется дней: " + defaultDeliveryTime);
            } else if (deliveryDistance <= 60) {
                defaultDeliveryTime += 1;
                System.out.println("Потребуется дней: " + defaultDeliveryTime);
            } else {
                defaultDeliveryTime += 2;
                System.out.println("Потребуется дней: " + defaultDeliveryTime);
            }
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void main(String[] args) {
        /*
        Задача 1
        Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
        и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам.
        Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        Результат программы выведите в консоль.
        Если год високосный, то напечатайте сообщение: «...  год — високосный год».
        Если год невисокосный, то: «... год — невисокосный год».
         */

        System.out.println("Задача 1");

        int year = 1588;

        if (isLeapYear(year)){
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        System.out.println();


        /*
        Задача 2
        Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
        Напишите метод, куда подаются два параметра:
        тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение,
        какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
         */

        System.out.println("Задача 2");

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();

        determinateVersion(clientOS, currentYear);

        System.out.println();


        /*
        Задача 3
        Возвращаемся к задаче на расчет дней доставки банковской карты.
        Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и
        возвращает итоговое количество дней доставки.
         */

        System.out.println("Задача 3");

        int deliveryDistance = 61;

        detrminateDeliveryDays(deliveryDistance);

    }
}
