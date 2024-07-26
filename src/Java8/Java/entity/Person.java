package Java8.Java.entity;

public class Person {
    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructor
    public Person(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + ", department='" + department + "'}";
    }
}
