package M1_CourseWorkExpert;

import java.util.Arrays;

public class Main {
    /*
    static int id = 0;
    static Employee[] employees = new Employee[10];
    */


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        //Список всех сотрудников со всмеми их данными
        employeeBook.employeesList();

        //Сумма ЗП всех сотрудников
        System.out.println("Затраты на ЗП всех сотрудников: " + employeeBook.monthSalary());

        //Вывод ЗП сотрудников определенного отдела
        System.out.println("Затраты на ЗП сотрудников определенного отдела:");
        System.out.println(employeeBook.departmentMonthSalary(6));

        //Сотрудник с минимальной зарплатой
        employeeBook.minSalaryEmployer();

        //Сотрудник с максимальной зарплатой
        employeeBook.maxSalaryEmployer();

        //Средняя зарплата среди всех сотрудников
        System.out.println("\nСредняя зарплата по всем сотрудникам: " + employeeBook.avgSalary());

        //Средняя зарплата среди сотрудников определенного отдела
        System.out.println(employeeBook.departmentAvgSalary(4));

        //Вывод ФИО всех сотрудников
        employeeBook.printEmployeesFio();

        //Вывод всех сотрудников определенного отдела
        employeeBook.departmentEmployeeList(4);

        //Индексирование зарплаты всех сотрудников
        employeeBook.SalaryIndexing(10);

        //Индексирование зарплаты сотрудников определенного отдела
        employeeBook.departmentSalaryIndexing(4, 10);


    }
}
