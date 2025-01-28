package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndCollectDemo {
    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3};
        List<Integer> list = Arrays.stream(ints)
                .map(e->e*10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);

        list = Stream.of(10, 20, 30)
                .map(e->e*10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
