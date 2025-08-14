package M1_CourseWorkAdvanced;

public class Employee {
    private final String fio;
    private int department;
    private float salary;
    private int employeeId;
    private static int id = 0;

    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.employeeId = id;
        id += 1;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId(){
        return employeeId;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public boolean equals(Employee employee){
        return this.fio.equals(employee.getFio()) &&
               this.department == employee.getDepartment() &&
               this.salary == employee.getSalary() &&
               this.employeeId == employee.getId();
    }

    public int hashCode(){
        return java.util.Objects.hash(fio, department, salary, employeeId);
    }

    public String toString(){
        return "Сотрудник: " + "ФИО: " + this.getFio() +
               ". Отдел: " + this.getDepartment() +
               ". ЗП: " + this.getSalary() +
               ". ID: " + this.getId();
    }

    //Для вывода сотрудников без указания отдела
    public String departmentList(){
        return "Сотрудник: " + "ФИО: " + this.getFio() +
                ". ЗП: " + this.getSalary() +
                ". ID: " + this.getId();
    }

    //Для вывода сотрудников с зарплатой меньшей чем аргумент
    public String departmentPoorList(){
        return "Сотрудник: " + "ID: " + this.getId()+
                "ФИО: " + this.getFio() +
                ". ЗП: " + this.getSalary();
    }

    //Для вывода сотрудников с зарплатой большей чем аргумент
    public String departmentReachList(){
        return "Сотрудник: " + "ID: " + this.getId()+
                ". ФИО: " + this.getFio() +
                ". ЗП: " + this.getSalary();
    }
}
