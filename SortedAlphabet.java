import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + id;
    }
}

public class RemoveDuplicateEmployees {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ankit", 1),
                new Employee("Rahul", 2),
                new Employee("Ankit", 3),
                new Employee("Priya", 4),
                new Employee("Rahul", 5)
        );

        Set<String> seenNames = new HashSet<>();

        List<Employee> uniqueEmployees = employees.stream()
                .filter(emp -> seenNames.add(emp.getName()))
                .collect(Collectors.toList());

        uniqueEmployees.forEach(System.out::println);
    }
}