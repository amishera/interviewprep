public class MultiplicationTable {
    static void displayMultiplicationTable(int num) {
        for (int i = 1; i <= 10;i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    public static void main(String[] args) {
        for (int i = 1;i <= 10;i++) {
            displayMultiplicationTable(i);
        }
    }
}
