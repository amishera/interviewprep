package jdk17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorExample {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L128X1024MixRandom")
                .create();

        System.out.println("Random int: "+randomGenerator.nextInt());
        System.out.println("Random double: "+randomGenerator.nextDouble());

        randomGenerator.ints(5, 1, 10).forEach(num -> System.out.println(num+ " "));
        RandomGeneratorFactory.all().forEach(factory -> System.out.println(factory.name()));
    }
}
