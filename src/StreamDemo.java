import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Johnny", "Doe");

        List<String> newNames = names.
                stream()
                .map(e -> e.toUpperCase())
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList())
                    ;

        System.out.println(newNames);
    }
}
