public class StringRerverser {
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length()-1;i >= 0;i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "world!";
        System.out.println(reverse(str));
    }
}
