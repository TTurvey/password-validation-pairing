import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PasswordValidator {

    private final String str;
    private final ArrayList<Character> charArray;

    public PasswordValidator(String str) {
        this.str = str;
        this.charArray = new ArrayList<Character>();
    }

    public void populateCharArray() {
        for (int i = 0; i < this.str.length(); i++) {
            charArray.add(str.charAt(i));
        }
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
        populateCharArray();

        boolean containsUppercase = false;
        for(int i = 0; i < this.charArray.size(); i++){
            if (Character.isUpperCase(this.charArray.get(i)) == true) {
                containsUppercase = true;
            }
        }
        return containsUppercase;
    }

    public boolean lowerCaseLetter() {
        populateCharArray();

        boolean containsLowercase = false;
        for(int i = 0; i < this.charArray.size(); i++){
            if (Character.isLowerCase(this.charArray.get(i)) == true) {
                containsLowercase = true;
            }
        }
        return containsLowercase;
    }

    public boolean containsNumber() {
        return str.matches(".*\\d.*") ? true : false;
    }

    public boolean containsUnderScore() {
//        regex only valid for single character string of "_"
        return str.matches("_") ? true : false;
    }

}

