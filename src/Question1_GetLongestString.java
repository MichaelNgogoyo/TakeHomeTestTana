import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question1_GetLongestString {
    public String getLongestString(List<Character> validCharacters, String[] strings) {
        //hashset to store valid Characters parameter
        HashSet<Character> characters = new HashSet<>(validCharacters);

        //initialize empty longest string
        String longestString = "";

        //for every string element in the strings array
        for (String s : strings) {

            boolean isValid = true;

            HashSet<Character> seen = new HashSet<>();

            //for every character in each string
            for (char c : s.toCharArray()) {

                //check for case if character c is not in characters set, break
                if (!characters.contains(c)) {
                    isValid = false;
                    break;
                }

                //use two pointers to check the longest valid string
                int left = 0;
                int right = 1;
                //if is valid and right is less than string length
                while (isValid && right < s.length()) {

                    //check if the characters are the same, set false otherwise proceed
                    if (s.charAt(left) == s.charAt(right)) {
                        isValid = false;
                        break;
                    }
                    //increment the pointers
                    left++;
                    right++;
                }

                //assign variable longesString to value if isValid, and current string length is greater than the existing string length, assign it to the existing string length.
                if (isValid && s.length() > longestString.length()) {
                    longestString = s;
                }
            }
        }
        //return longest string
        return longestString;
    }
}
