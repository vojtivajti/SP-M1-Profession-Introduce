package M1_CourseWorkBase;

public class Employee {
    private final String fio;
    private int department;
    private int salary;
    private int employeeId;
    private static int id = 0;

    public Employee(String fio, int department, int salary) {
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

    public int getSalary() {
        return salary;
    }

    public int getId(){
        return employeeId;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary){
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

}
