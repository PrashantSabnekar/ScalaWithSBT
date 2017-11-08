package lambdas;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

    public void predicate() {
        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(100));
    }

    public void consumer() {

        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee("Bush", 123.456));
        employees.add(new Employee("Hush", 423.456));
        employees.add(new Employee("Mush", 3.456));

        Consumer<Employee> consumer = employee -> {
            System.out.println("name = " + employee.name);
            System.out.println("salary = " + employee.salary);
        };


        processEmployees(employees, consumer);

    }

    private void processEmployees(List<Employee> employees, Consumer<Employee> consumer) {
        for(Employee e : employees) {
            consumer.accept(e);
        }
    }


    public static void main(String args[]) {

        Demo demo = new Demo();
        demo.predicate();
        demo.consumer();

    }
}

class Employee {
    public String name;
    public Double salary;
    public String department;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "NA";
    }

    public Employee(String name, Double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}