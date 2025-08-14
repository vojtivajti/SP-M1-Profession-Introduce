package M1_CourseWorkAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int id = 0;
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание сотрудников
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100000);
        Employee employee2 = new Employee("Петров Петр Петрович", 2, 150000);
        Employee employee3 = new Employee("Сидоров Сидр Сидорович", 3, 200000);
        Employee employee4 = new Employee("Иванов Иван Иванович", 2, 100000);
        Employee employee5 = new Employee("Петров Петр Петрович", 2, 100000);
        Employee employee6 = new Employee("Евгеньев Евген Евгеньевич", 4, 1000000);
        Employee employee7 = new Employee("Симонова Наталья Петровна", 5, 17000);
        Employee employee8 = new Employee("Пушкин Александр Сергеевич", 2, 170000);
        Employee employee9 = new Employee("Сидоренко Вячеслав Григорьевич", 5, 1070000);
        Employee employee10 = new Employee("Петрова Евгения Александровна", 5, 1080000);

        //Размещение сотрудников в списке сотрудников
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        /*
        8а Получить список всех сотрудников со всеми имеющимися по ним данными
        (вывести в консоль значения всех полей (toString));
        */
        System.out.println("Список всех сотрудников:");
        employeesList(employees);

        /*
        8b Посчитать сумму затрат на ЗП в месяц;
         */
        System.out.println("\nСумма затрат на ЗП в месяц: " + monthSalary(employees));

        /*
        8с Найти сотрудника с минимальной ЗП;
         */
        minSalaryEmployer(employees);

        /*
        8d Найти сотрудника с максимальной ЗП;
         */
        maxSalaryEmployer(employees);

        /*
        8e Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
         */
        System.out.println("\nСреднее значение зарплат:");
        System.out.println(avgSalary(employees));

        /*
        8f Распечатать ФИО всех сотрудников (метод void).
         */
        System.out.println("\nФИО сотрудников:");
        printEmployeesFio(employees);

        System.out.print("\nРаботы повышенной сложности (1 - приступить, 0 - завершение работы): ");
        int advanced = scanner.nextInt();

        while (advanced == 1) {
            int advancedOption = advancedMenu();

            if (advancedOption == 1) {
                System.out.print("\nВведите на какой % произвести индексацию: ");
                float indexArg = scanner.nextFloat();
                SalaryIndexing(indexArg);
            } else if (advancedOption == 2) {
                departmentActions(employees);
            } else if (advancedOption == 3) {
                System.out.print("\nВывести сотрудников с зарплатой менее чем (введите число): ");
                float indexArg = scanner.nextFloat();
                employeesSalaryLessThan(employees, indexArg);
            } else if (advancedOption == 4) {
                System.out.print("\nВывести сотрудников с зарплатой более чем (введите число): ");
                float indexArg = scanner.nextFloat();
                employeesSalaryMoreThan(employees, indexArg);
            } else if (advancedOption == 0) {
                System.out.println("Завершение действий с отделом.");
                break;
            } else {
                System.out.println("Команда не распознана. Завершение действий повышенной сложности.");
            }

            System.out.print("\nРаботы повышенной сложности (1 - приступить, 0 - завершение работы): ");
            advanced = scanner.nextInt();
        }
    }

    // Вывод всего списка сотрудников
    public static void employeesList(Employee[] employees){
        for (Employee employee : employees){
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    //Вывод всех сотрудников отдела
    public static void departmentEmployeeList(Employee[] employees, int departmentNumber){
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                System.out.println(employee.departmentList());
            }
        }
    }

    // Расчет месячной зарплаты всех сотрудников
    public static float monthSalary(Employee[] employees){
        float summSalary = 0;
        for (Employee employee : employees){
            if (employee != null){
                summSalary += employee.getSalary();
            }
        }
        return summSalary;
    }

    // Расчет месячной зарплаты сотрудников отдела
    public static float departmentMonthSalary(int departmentNumber){
        float departmentMonthSalary = 0;

        for (Employee employee:employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                departmentMonthSalary += employee.getSalary();
            }
        }

        return departmentMonthSalary;

    }

    // Поиск сотрудника с минимальной зарплатой
    public static void minSalaryEmployer(Employee[] employees){
        float minSalary = Float.MAX_VALUE;
        int poorestIndex = 0;

        for (Employee employee : employees){
            if (employee != null){
                if (employee.getSalary() < minSalary){
                    minSalary = employee.getSalary();
                    poorestIndex = Arrays.asList(employees).indexOf(employee);
                }
            }
        }

        System.out.println("\nМинимальная зарплата у:");
        System.out.println(employees[poorestIndex].toString());
    }

    //Поиск сотрудника с минимальной зарплатой по отделу
    public static void departmentMinSalaryEmployer(int departmentNumber){
        System.out.println("\nСотрудник " + departmentNumber + " отдела с минимальной зп:");
        float minSalary = Float.MAX_VALUE;
        int poorestIndex = 0;

        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                if (employee.getSalary() < minSalary){
                    minSalary = employee.getSalary();
                    poorestIndex = Arrays.asList(employees).indexOf(employee);
                }
            }
        }

        System.out.println(employees[poorestIndex].getFio() + " " + employees[poorestIndex].getSalary());
    }

    //Поиск сотрудника с максимальной зарплатой
    public static void maxSalaryEmployer(Employee[] employees){
        float maxSalary = Float.MIN_VALUE;
        int reachestIndex = 0;

        for (Employee employee : employees){
            if (employee != null){
                if (employee.getSalary() > maxSalary){
                    maxSalary = employee.getSalary();
                    reachestIndex = Arrays.asList(employees).indexOf(employee);
                }
            }
        }

        System.out.println("\nМаксимальная зарплата у:");
        System.out.println(employees[reachestIndex].toString());
    }

    //Поиск сотрудника с максимальной зарплатой по отделу
    public static void departmentMaxSalaryEmployer(int departmentNumber){
        System.out.println("\nСотрудник " + departmentNumber + " отдела с максимальной зп:");
        float maxSalary = Float.MIN_VALUE;
        int reachestIndex = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    reachestIndex = Arrays.asList(employees).indexOf(employee);
                }
            }
        }
        System.out.println(employees[reachestIndex].getFio() + " " + employees[reachestIndex].getSalary());
    }

    // Средняя зарплата всех сотрудников
    public static float avgSalary(Employee[] employees){
        int employeeCount = 0;
        for (Employee employee : employees){
            if (employee != null){
                employeeCount += 1;
            }
        }

        if (employeeCount != 0){
            return (float) monthSalary(employees) / employeeCount;
        } else {
            return 0;
        }
    }

    // Средняя зарплата сотрудников по отделу
    public static float departmentAvgSalary(int departmentNumber){
        int employeeCount = 0;
        for (Employee employee:employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                employeeCount += 1;
            }
        }

        if (employeeCount != 0){
            return (float) departmentMonthSalary(departmentNumber) / employeeCount;
        } else {
            return 0;
        }
    }

    // Распечатка ФИО всех сотрудников
    public static void printEmployeesFio(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee.getFio());
        }
    }

    // 1. Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public static void SalaryIndexing(float indexArg){
        System.out.println("\nПроцесс индексирования зарплаты:");
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFio());
                System.out.println("ЗП была: " + employee.getSalary());
                employee.setSalary(employee.getSalary() + (employee.getSalary() * indexArg/100));
                System.out.println("ЗП стала: " + employee.getSalary() + "\n");
            }
        }
    }

    //Индексирование зарплаты сотрудников отдела
    public static void departmentSalaryIndexing(int departmentNumber, float indexArg){
        System.out.println("Процесс индексирования зарплаты:");

        for(Employee employee:employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                System.out.println(employee.getFio());
                System.out.println("ЗП была: " + employee.getSalary());
                employee.setSalary(employee.getSalary() + (employee.getSalary() * indexArg/100));
                System.out.println("ЗП стала: " + employee.getSalary() + "\n");
            }
        }
    }

    // Меню повышенной сложности
    public static int advancedMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВозможные действия:"
                + "\n1 - Индексация заработной платы;"
                + "\n2 - Действия с отделом;"
                + "\n3 - Поиск сотрудников с зарплатой менее чем ...;"
                + "\n4 - Поиск сотрудников с зарплатой более чем ...;"
                + "\n0 - Выход из меню повышенной сложности."
                + "\nВыберите действие: ");
        return scanner.nextInt();
    }

    // Меню работы с отделом
    public static int departmentActionMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВозможные действия:"
                + "\n1 - Сотрудник отдела с минимальной зарплатой;"
                + "\n2 - Сотрудник отдела с максимальной зарплатой;"
                + "\n3 - Сумма затрат на зарплату по отделу;"
                + "\n4 - Средняя зарплата по отделу;"
                + "\n5 - Индексация зарплат сотрудников отдела;"
                + "\n6 - Список сотрудников отдела;"
                + "\n0 - Выход из меню работы с отелом."
                + "\nВыберите действие: ");

        return scanner.nextInt();
    }
    // Работа с отделом
    public static void departmentActions(Employee[] employees){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер отдела (1-5): ");
        int departmentNumber = scanner.nextInt();

        int departmentAction = departmentActionMenu();

        while (departmentAction >= 0 && departmentAction <=6) {
            if (departmentAction == 1){
                departmentMinSalaryEmployer(departmentNumber);
            } else if (departmentAction == 2) {
                departmentMaxSalaryEmployer(departmentNumber);
            } else if (departmentAction == 3){
                System.out.println("\nСумма затрат на зп по "
                        + departmentNumber + " отделу: "
                        + departmentMonthSalary(departmentNumber));
            } else if (departmentAction == 4) {
                System.out.println("\nСредняя зарплата по "
                        + departmentNumber + " отделу: "
                        + departmentAvgSalary(departmentNumber));
            } else if (departmentAction == 5) {
                System.out.print("\nВведите на какой % произвести индексацию: ");
                float indexArg = scanner.nextFloat();
                departmentSalaryIndexing(departmentNumber, indexArg);
            } else if (departmentAction == 6) {
                System.out.println("\nСписок сотрудников " + departmentNumber + " отдела: ");
                departmentEmployeeList(employees, departmentNumber);
            } else if (departmentAction == 0) {
                System.out.println("Завершение действий с отделом.");
                break;
            } else {
                System.out.println("Команда не распознана. Завершение действий с отделом.");
            }

            departmentAction = departmentActionMenu();
        }
    }

    // Сотрудники с ЗП меньшим чем аргумент
    public static void employeesSalaryLessThan(Employee[] employees, float salary){
        for (Employee employee: employees){
            if (employee != null && employee.getSalary() < salary){
                System.out.println(employee.departmentPoorList());
            }
        }
    }
    // Сотрудники с ЗП большим чем аргумент
    public static void employeesSalaryMoreThan(Employee[] employees, float salary){
        for (Employee employee: employees){
            if (employee != null && employee.getSalary() > salary){
                System.out.println(employee.departmentReachList());
            }
        }
    }

}
