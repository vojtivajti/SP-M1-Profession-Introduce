package M1_CourseWorkExpert;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100000);
    Employee employee2 = new Employee("Петров Петр Петрович", 2, 150000);
    Employee employee3 = new Employee("Сидоров Сидр Сидорович", 3, 200000);
    Employee employee4 = new Employee("Иванов Иван Иванович", 2, 100000);
    Employee employee5 = new Employee("Петров Петр Петрович", 2, 100000);
    Employee employee6 = new Employee("Евгеньев Евген Евгеньевич", 4, 1000000);
    Employee employee7 = new Employee("Симонова Наталья Петровна", 5, 17000);
    Employee employee8 = new Employee("Пушкин Александр Сергеевич", 6, 170000);
    Employee employee9 = new Employee("Сидоренко Вячеслав Григорьевич", 7, 1070000);
    Employee employee10 = new Employee("Петрова Евгения Александровна", 8, 1080000);

    // Создание сотрудников
    public EmployeeBook(){
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
    }

    //Список всех сотрудников со всмеми их данными
    public void employeesList(){
        System.out.println("\nСписок всех сотрудников:");
        for (Employee employee : employees){
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    //Месячная ЗП всех сотрудников
    public int monthSalary(){
        int summSalary = 0;
        for (Employee employee : employees){
            if (employee != null){
                summSalary += employee.getSalary();
            }
        }
        return summSalary;
    }

    // Расчет месячной зарплаты сотрудников определенного отдела
    public float departmentMonthSalary(int departmentNumber){
        float departmentMonthSalary = 0;

        for (Employee employee:employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                departmentMonthSalary += employee.getSalary();
            }
        }

        return departmentMonthSalary;

    }

    //Сотрудник с минимальной зарплатой
    public void minSalaryEmployer(){
        int minSalary = Integer.MAX_VALUE;
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

    //Сотрудник с максимальной зарплатой
    public void maxSalaryEmployer(){
        int maxSalary = Integer.MIN_VALUE;
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

    //Средняя зарплата среди всех сотрудников
    public float avgSalary(){
        int employeeCount = 0;
        for (Employee employee : employees){
            if (employee != null){
                employeeCount += 1;
            }
        }

        if (employeeCount != 0){
            return (float) monthSalary() / employeeCount;
        } else {
            return 0;
        }
    }

    //Вывод ФИО всех сотрудников
    public void printEmployeesFio(){
        System.out.println("\nФИО всех сотрудников:");
        for(Employee employee : employees){
            System.out.println(employee.getFio());
        }
    }

    //Вывод всех сотрудников отдела
    public void departmentEmployeeList(int departmentNumber){
        System.out.println("\nСписок сотрудников " + departmentNumber + " отдела:");
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == departmentNumber){
                System.out.println(employee.departmentList());
            }
        }
    }



    public boolean addEmployee(Employee newEmployee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(newEmployee)){
                System.out.println("Такой сотрудник уже существует" + employees[i].getId());
            }

            if (employees[i] == null){
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id){
        if (notFoundId(id)) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getId() == id) {
                    System.out.println("Удален сотрудник " + employees[i].getFio() + " " + employees[i].getId());
                    employees[i] = null;
                    break;
                }
            }
        } else {
            System.out.println("Сотрудник с " + id + " не найден.");
        }
    }

    public boolean notFoundId(int id){
        for (Employee employee : employees){
            if (employee != null && employee.getId() == id){
                return true;
            }
        }
        return false;
    }

}
