package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortCircuitDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(2, i->i*2);
        List<Integer> collect = stream
                .skip(3)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
