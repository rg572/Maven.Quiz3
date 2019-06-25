package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String string) {
        String[] str = string.split(" ");
        StringBuilder sbuild = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            if (!VowelUtils.hasVowels(str[i])) {
                sbuild.append(str[i]).append("ay");
            } else if (VowelUtils.startsWithVowel(str[i])) {
                sbuild.append(str[i]).append("way");
            } else {
                sbuild.append(str[i].substring(VowelUtils.getIndexOfFirstVowel(str[i])))
                        .append(str[i].substring(0, VowelUtils.getIndexOfFirstVowel(str[i]))).append("ay");
            }
            if(i != str.length-1){
                sbuild.append(" ");
            }
        }

        return sbuild.toString();
    }
}
