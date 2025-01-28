package streams;

import java.util.stream.Stream;

public class StreamBuilderDemo {
    public static void main(String[] args) {
        Stream.Builder<Integer> builder = Stream.builder();
        builder.accept(10);
        builder.accept(20);
        builder.build().forEach(System.out::println);
    }
}
