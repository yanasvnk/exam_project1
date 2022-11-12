public class Employee {
    private final String name;
    private int id;
    private static int counter = 0;
    private int department;
    private int salary;

    public Employee (String name, int salary, int department) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName () {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public void setDepartment (int department) {
        this.department = department;
    }
    public void setSalary (int salary) {this.salary = salary;
    }

    @Override
    public String toString() {
        return "id - " + id + "; " + "сотрудник - " + name + "; " + "заработная плата - " + salary + "; " + "отдел - " + department;
    }
    }

