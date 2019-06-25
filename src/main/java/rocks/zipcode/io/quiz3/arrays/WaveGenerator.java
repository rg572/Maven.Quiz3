package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                str = str.substring(0,i).toLowerCase() + Character.toUpperCase(str.charAt(i)) + str.substring(i+1).toLowerCase();
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
