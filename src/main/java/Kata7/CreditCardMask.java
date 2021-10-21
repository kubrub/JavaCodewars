package Kata7;

public class CreditCardMask {
    public static String maskify(String string) {
        if (string.length() < 4) {
            return string;
        }
        else {
            String newString = "";
            for (int i = 0; i < string.length(); i++) {
                if (i >= 4) {
                    newString += "#";
                }
            }
            newString += string.substring(string.length() - 4);
            return newString;
        }
    }
}
