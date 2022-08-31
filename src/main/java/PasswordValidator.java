public class PasswordValidator {

    public Boolean validate(String str) {
        if (moreThanEight(str)) return false;
        return true;

    }

    public static boolean moreThanEight(String str) {
        return str.length() <= 8 ? false : true;
    }
}
