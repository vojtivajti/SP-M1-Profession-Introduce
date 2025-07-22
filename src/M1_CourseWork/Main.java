package M1_CourseWork;

public class Main {
    static int id = 0;
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100000);
        employees[0] = employee1;

        employeesList(employees);
    }

    public static void employeesList(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
    }

    public static int monthSalary(Employee[] employees){
        int summSalary = 0;
        for (Employee employee : employees){
            summSalary += employee.getSalary();
        }
        return summSalary;
    }

    public static void minSalaryEmployer(Employee[] employees){
        if (employees.length() > 0){
            int minSalary = employees[0].getSalary();
            int minSalaryIndex = 0;

            for (int i = 0; i < employees.length(); i++){
                if (employees[i].getSalary() < minSalary){
                    minSalary = employees[i].getSalary();
                    minSalaryIndex = i;
                }
            }

            System.out.println("Сотрудник с минимальной ЗП:");
            System.out.println(employees[minSalaryIndex].toString());
        } else {
            System.out.println("В списке нет сотрудников");
        }
    }

    public static void maxSalaryEmployer(Employee[] employees){
        if (employees.length() > 0){
            int maxSalary = employees[0].getSalary();
            int maxSalaryIndex = 0;

            for (int i = 0; i < employees.length(); i++){
                if (employees[i].getSalary() < maxSalary){
                    maxSalary = employees[i].getSalary();
                    maxSalaryIndex = i;
                }
            }

            System.out.println("Сотрудник с максимальной ЗП:");
            System.out.println(employees[maxSalaryIndex].toString());
        } else {
            System.out.println("В списке нет сотрудников");
        }
    }

    public static float avgSalary(Employee[] employees){
        if (employees.length() > 0){
            return (float) monthSalary(employees) / employees.length();
        } else {
            return 0;
        }
    }

    public static void printEmployees(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
    }

}
