package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        boolean[] beenChecked = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            if(!beenChecked[i]) {
                Integer count = 1;
                for(int j = i + 1; j < array.length; j++){
                    if(array[i].equals(array[j])){
                        count++;
                        beenChecked[j] = true;
                    }
                }
                if(count%2==1){
                    return array[i];
                }
            }

        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        boolean[] beenChecked = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            if(!beenChecked[i]) {
                Integer count = 1;
                for(int j = i + 1; j < array.length; j++){
                    if(array[i].equals(array[j])){
                        count++;
                        beenChecked[j] = true;
                    }
                }
                if(count%2==0){
                    return array[i];
                }
            }

        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return (int)Arrays.stream(array).filter((val) -> val.equals(valueToEvaluate)).count();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return  Arrays.stream(array).filter((val) -> predicate.apply(val)).
                toArray((i)->(SomeType[]) Array.newInstance(array[0].getClass(), i));

    }

}
