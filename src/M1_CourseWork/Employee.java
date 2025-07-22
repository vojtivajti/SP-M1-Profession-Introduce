package M1_CourseWork;

public class Employee {
    private final String fio;
    private int department;
    private int salary;
    private static int id = 0;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = id;
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
        return id;
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
               this.id == employee.getId();
    }

    public int hashCode(){
        return java.util.Objects.hash(fio, department, salary, id);
    }

    public String toString(Employee employee){
        return "Сотрудник: " + "ФИО: " + employee.getFio() +
               ". Отдел: " + employee.getDepartment() +
               ". ЗП: " + employee.getSalary() +
               ". ID: " + employee.getId();
    }

}
