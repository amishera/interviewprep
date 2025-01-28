package streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipLimitDemo {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i*2);
        List<Integer> collect = infiniteStream
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
