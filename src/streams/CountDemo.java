package streams;

import java.util.List;

public class CountDemo {
    static record Employee(int id, String name, double salary) {

    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", 100.0);
        Employee employee2 = new Employee(2, "John", 200001);
        Employee employee3 = new Employee(3, "John", 100.0);

        List<Employee> employeeList = List.of(employee, employee2, employee3);
        Long total = employeeList.stream()
                .filter(e -> e.salary() > 20000)
                .count();
        System.out.println(total);
    }
}
