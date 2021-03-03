import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your password:");
        try {
            String password = scanner.nextLine();
            System.out.println(PasswordValidator.validate(password));
        } catch(NullPointerException e){
            System.err.println("Invalid input!");
        }
    }


    static class PasswordValidator {
        static public String validate(String s) {
            int upperCount = 0;int digits = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isUpperCase(chars[i])) {
                    upperCount++;
                } else if (Character.isDigit(chars[i])) {
                    digits++;
                }
            }
            return upperCount >= 2 && digits >= 2
                    ? "Password is valid!"
                    : String.format("Invalid Password!" +
                    "%nPassword must contain at least two upper case letters and two digits.");
        }
    }
}

