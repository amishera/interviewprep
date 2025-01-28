package streams;

import java.util.Arrays;
import java.util.List;

public class ListToArrayDemo {
    public static void main(String[] args) {
        List<String> nameList = List.of("John", "Jane", "Joan");

        String[] empArr = nameList.stream().toArray(String[]::new);
        System.out.println(String.join(",", empArr));

        Arrays.stream(empArr).forEach(System.out::println);
    }
}
