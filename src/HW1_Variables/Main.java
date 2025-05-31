package HW1_Variables;

public class Main {
    public static void main(String[] args) {
        /*Задача 1
        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более,
        должно соответствовать правилу camelCase.
        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
         */
        System.out.println("Задача 1");
        byte byteVariable = 127;
        short shortVariable = -10000;
        int intVariable = 128;
        long longVariable = 1000000L;
        float floatVariable = 1.1234567f;
        double doubleVariable = 12.1234567891011;

        System.out.println("Значение переменно byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменно shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменно intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменно longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменно floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменно doubleVariable с типом double равно " + doubleVariable);

        System.out.println();


        /*Задача 2
        Ниже дан список различных значений. Инициализируйте переменные,
        используйте изученные ранее типы переменных.
        Значения: 27.12; 987 678 965 549; 2,786; 569; -159; 27897; 67
         */
        System.out.println("Задача 2");
        float floatVariable2 = 27.12f;
        long longVariable2 = 987678965549L;
        double doubleVariable2 = 2.786;
        short shortVariable2 = 569;
        short shortVariable3 = -159;
        int intVariable2 = 27897;
        byte byteVariable2 = 67;

        System.out.println();


        /*Задача 3
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 3");
        int ludaStudents = 23;
        int annaStudents = 27;
        int katyaStudents = 30;
        int paperPieces = 480;
        int paperPiecePerStudent = paperPieces / (ludaStudents + annaStudents + katyaStudents);

        System.out.println("На каждого ученика рассчитано " + paperPiecePerStudent + " листов бумаги");

        System.out.println();


        /*Задача 4
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        Какая производительность машины будет: за 20 минут, в сутки, за 3 дня, за 1 месяц?
        Рассчитывайте производительность работы машины в том случае, если она работает без перерыва
        заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 4");
        int perfomance2Min = 16;
        int minutesInDay = 24 * 60;

        System.out.println("За " + "20 минут " + perfomance2Min * 10 + " штук бытулок");
        System.out.println("За " + "сутки " + perfomance2Min * minutesInDay / 2 + " штук бытулок");
        System.out.println("За " + "три дня " + perfomance2Min * minutesInDay * 3 / 2 + " штук бытулок");
        System.out.println("За " + "1 месяц " + perfomance2Min * minutesInDay * 30 / 2 + " штук бытулок");

        System.out.println();


        /*Задача 5
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 5");

        int paintAmount = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int pantForClass = paintAmount / (whitePaintPerClass + brownPaintPerClass);

        System.out.println("В школе, где " + pantForClass + " классов, нужно "
                + 2 * pantForClass + " банок белой краски и "
                + 4 * pantForClass + " банок коричневой краски"
                );

        System.out.println();


        /*Задача 6
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.

        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.
         */
        System.out.println("Задача 6");

        int bananaWeightG = 80;
        int milkWeightG = 105;
        int plombirWeightG = 100;
        int eggWeightG = 70;

        int cocktailWeightG = 5 * bananaWeightG + 2 * milkWeightG + 2 * plombirWeightG + 4 * eggWeightG;
        float cocktailWeightKg = cocktailWeightG / 1000f;

        System.out.println("Вес спортзавтрака в граммах: " + cocktailWeightG);
        System.out.println("Вес спортзавтрака в килограммах: " + cocktailWeightKg);

        System.out.println();


        /*Задача 7
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории,
        нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе
        от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
         */
        System.out.println("Задача 7");

        int weightToLose = 7;
        float weightPerDay1 = 250;
        float weightPerDay2 = 500;
        float weightPerDayAvg = (weightPerDay1 + weightPerDay2) / 2;

        float dayWithLose250 = weightToLose / (weightPerDay1 / 1000);
        float dayWithLose500 = weightToLose / (weightPerDay2 / 1000);
        float dayWithLoseAvg = weightToLose / (weightPerDayAvg / 1000);

        System.out.println("Если спортсмен будет терять по " + (int)weightPerDay1
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + dayWithLose250 + " дней.");
        System.out.println("Если спортсмен будет терять по " + (int)weightPerDay2
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + dayWithLose500 + " дней.");
        System.out.println("Если спортсмен будет терять в среднем по " + (int)weightPerDayAvg
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + dayWithLoseAvg + " дней.");

        System.out.println("Альтернативное решение");
        System.out.println("Если спортсмен будет терять по " + (int)weightPerDay1
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + (int)dayWithLose250 + " дней.");
        System.out.println("Если спортсмен будет терять по " + (int)weightPerDay2
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + (int)dayWithLose500 + " дней.");
        System.out.println("Если спортсмен будет терять в среднем по " + (int)weightPerDayAvg
                + " грамм в день, то для похудения на " + weightToLose + " кг, потребуется "
                + (int)(dayWithLose250 + dayWithLose500) / 2 + " дней.");



        System.out.println();



        /*Задача 8
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
        а также провести расчет для следующих сотрудников:
        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и
        после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до
        и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */
        System.out.println("Задача 8");

        float bonus = 0.1f;
        int marySalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;

        System.out.println("Маша теперь получает " + marySalary * (1 + bonus) + " рублей. " +
                "Годовой доход вырос на " + marySalary * bonus * 12 + " рублей");
        System.out.println("Денис теперь получает " + denSalary * (1 + bonus) + " рублей. " +
                "Годовой доход вырос на " + denSalary * bonus * 12 + " рублей");
        System.out.println("Кристина теперь получает " + krisSalary * (1 + bonus) + " рублей. " +
                "Годовой доход вырос на " + krisSalary * bonus * 12 + " рублей");



    }
}
