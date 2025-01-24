package jdk17;

public class PatternMatchingWithSwitchCase {
    static String checkForObject(Object obj) {
        return switch(obj) {
            case Integer i -> "type is integer";
            case Float f -> "type is float";
            case String s -> "type is string";
            default -> "type is undefined";
        };
    }

    public static void main(String[] args) {
        System.out.println(checkForObject("HW"));
    }
}
