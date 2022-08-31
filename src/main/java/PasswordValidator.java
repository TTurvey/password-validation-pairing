import java.util.ArrayList;
import java.util.Arrays;

public class PasswordValidator {

    private final String str;
    private final ArrayList<Character> charArray;

    public PasswordValidator(String str) {
        this.str = str;
        this.charArray = Arrays.asList(str.toCharArray())

    }

    public Boolean validate() {
        if (str == "") {
            return false;
        }
        if (moreThanEight() == false) {
            return false;
        }
        return false;

    }

    public boolean moreThanEight() {
        return 8 < this.str.length() ? true : false;
    }

    public boolean capitalLetter() {
        addCharacterstoArrayList();
        System.out.println(this.charArray);
//        char[] charArray = str.toCharArray();

        boolean containsUppercase = false;
        for(int i = 0; i < this.charArray.size(); i++){
            if (Character.isUpperCase(this.charArray.get(i)) == true) {
                containsUppercase = true;
            }
        }
        return containsUppercase;
    }

//    public static boolean lowerCaseLetter(String str) {
//        char[] charArray =
//
//        return false;
//    }
}
