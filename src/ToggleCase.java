public class ToggleCase {
    static String toggle(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < str.length();i++) {
            int ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = 'a' + (ch - 'A');
                System.out.println("offset "+(ch-'A'));
            } else if (ch >= 'a' && ch <= 'z') {
                ch = 'A' + (ch - 'a');
                System.out.println("offset "+(ch-'a'));
            }

            stringBuilder.append((char) ch);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "hELLO WoRlD";
        System.out.println(toggle(str));
    }
}
