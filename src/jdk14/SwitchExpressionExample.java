package jdk14;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int day = 3;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
        System.out.println(result); // Output: Wednesday
    }
}
