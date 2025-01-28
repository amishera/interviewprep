package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapMultiDemo {
    public static void main(String[] args) {
        Stream.of(1,2,3).<String>mapMulti((number, consumer) -> {
            consumer.accept(number+"a");
            consumer.accept(number+"b");
        }).forEach(System.out::println);



    }
}
