package dexcom.assignment;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static Boolean isAnagram(String string1, String string2) {

        String input1 = string1.toLowerCase().replaceAll("\\s", "");
        String input2 = string2.toLowerCase().replaceAll("\\s", "");

        if(input1.length() != input2.length()){
            return false;
        }

        HashMap<Character, Integer> inputChars1 = countChars(input1);
        HashMap<Character, Integer> inputChars2 = countChars(input2);

        //System.out.printf(String.valueOf(inputChars1));
        //System.out.printf(String.valueOf(inputChars2));

        Boolean isAnagram = new Boolean(false);

        for(Map.Entry<Character,Integer> item : inputChars1.entrySet()){
            if(inputChars2.containsKey(item.getKey())){
                if(inputChars2.get(item.getKey()) == item.getValue()){
                    isAnagram = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return isAnagram;
    }

    static HashMap<Character, Integer> countChars(String string) {

        HashMap<Character, Integer> mapchars = new HashMap<Character, Integer>();
        char charvalue;

        for(int i=0; i < string.length();i++){
            charvalue = string.charAt(i);
            if ( mapchars.containsKey(charvalue) ){
                mapchars.put(charvalue, mapchars.get(charvalue) + 1);
            } else {
                mapchars.put(charvalue,1);
            }
        }
        return  mapchars;
    }
}