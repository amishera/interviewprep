public class SwitchCaseLambda {
    public static void main(String[] args) {
        String day = "TH";
        String result = switch(day) {
            case "M","w","f" -> "MWF";
            case "T","TH","S" -> "TTS";

            default -> {
                if (day.isEmpty()) {
                    yield "Please insert a valid day";
                } else {
                    yield "looks like a sunday";
                }
            }
        };
        System.out.println("result: "+result);
    }
}
