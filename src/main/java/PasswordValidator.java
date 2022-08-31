public class PasswordValidator {

    public Boolean validate(String str) {
        System.out.println("".length());

        if (str == "") {
            return false;
        }

        if (moreThanEight(str) == false) {
            return false;
        }

        return false;

    }

    public static boolean moreThanEight(String str) {
        return 8 < str.length() ? true : false;
    }

    public static boolean capitalLetter(String str) {
        String[] stringArray = str.split("");
        char[] charArray = str.toCharArray();

        boolean containsUppercase = false;

        for(int i = 0; i < charArray.length; i++){
            if (Character.isUpperCase(charArray[i]) == true) {
                containsUppercase = true;
            }
        }
        return containsUppercase;
    }

    public static boolean lowerCaseLetter(String str) {
        return false;
    }
}
