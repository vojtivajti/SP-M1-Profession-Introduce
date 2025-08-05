package M1_CourseWorkAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int id = 0;
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
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

        /*
        1. Индексация зарплат
         */
        SalaryIndexing(1.5f);

        departmentActions(employees);

    }

    public static void employeesList(Employee[] employees){
        for (Employee employee : employees){
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static float monthSalary(Employee[] employees){
        float summSalary = 0;
        for (Employee employee : employees){
            if (employee != null){
                summSalary += employee.getSalary();
            }
        }
        return summSalary;
    }

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

    public static void printEmployeesFio(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee.getFio());
        }
    }

    /*
    1. Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
     */

    public static void SalaryIndexing(float indexArg){
        System.out.println("\nПроцесс индексирования зарплаты:");
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFio());
                System.out.println("ЗП была " + employee.getSalary());
                employee.setSalary(employee.getSalary() * indexArg);
                System.out.println("ЗП стала " + employee.getSalary() + "\n");
            }
        }
    }

    public static void departmentActions(Employee[] employees){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер отдела (1-5): ");
        int departmentNumber = scanner.nextInt();

        System.out.println("Сотрудник с минимальной зп:");
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

        System.out.println("\nСотрудник с максимальной зп:");
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

}
