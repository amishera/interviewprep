package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class MapToLongDemo {
    public static void main(String[] args) {
        List<String> numbersAsString = Arrays.asList("10000000000", "20000000000");
        LongStream longStream = numbersAsString.stream()
                .mapToLong(Long::parseLong);
        longStream.forEach(System.out::println);
    }
}
