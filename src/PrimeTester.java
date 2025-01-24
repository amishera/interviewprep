public class PrimeTester {
    public static boolean testPrime(int num) {
        // 1.. sqrt(num)
        if (num == 1) {
            return false;
        }
        for (int i = 2;i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 4;

        for (int i = 1;i <= 100;i++) {
            boolean result = testPrime(i);
            if (result) {
                System.out.println(i);
            }
        }
    }
}
