package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapMultiToIntDemo {
    public static void main(String[] args) {
        Stream.of("1,2", "3,4")
                .mapMultiToInt((s, consumer) -> {
                    Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).forEach(consumer);
                }).forEach(System.out::println);
    }
}
