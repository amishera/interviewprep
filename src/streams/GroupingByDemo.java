package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
    static class Employee {
        int id;
        String name;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Bill Gates";

        Employee employee2 = new Employee();
        employee2.name = "Jeff Bezos";

        Employee employee3 = new Employee();
        employee3.name = "Mark Zuckerberg";

        List<Employee> empList = Arrays.asList(employee1, employee2, employee3);
        Map<Character, List<Employee>> groupingByAlphabet = empList.stream().collect(
                Collectors.groupingBy(e -> new Character(e.name.charAt(0)))
        );

        System.out.println(groupingByAlphabet);
    }
}
