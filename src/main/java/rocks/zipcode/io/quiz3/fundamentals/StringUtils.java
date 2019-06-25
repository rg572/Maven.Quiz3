package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> set = new LinkedHashSet<>();
        for(int i =0; i < string.length(); i++){
            for(int j = i +1 ; j <= string.length(); j++){
                set.add(string.substring(i,j));
            }
        }
        return set.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
