package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        namesNested.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
