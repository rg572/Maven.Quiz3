package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static Boolean hasVowels(String word) {
        return !getIndexOfFirstVowel(word).equals(-1);
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if(isVowel(word.charAt(0))){
            return true;
        }
        else {
            return false;
        }
    }

    public static Boolean isVowel(Character character) {
        Character c = Character.toUpperCase(character);
        if(c == 'A' || c== 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        else {
            return false;
        }
    }
}
