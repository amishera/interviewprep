package jdk16;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 16!";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
