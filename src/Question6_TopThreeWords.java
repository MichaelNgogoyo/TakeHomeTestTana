import java.util.*;

public class Question6_TopThreeWords {


    public static void main(String[] args) {
        String s = "hi there care to discuss algorithm basis or how to solve algorithm or";

        List<String> result = topThreeWords(s);
        for(int i =0; i<result.size(); i++){
            System.out.print(result.get(i) +", ");
        }
    }

    public static List<String> topThreeWords(String sentence) {

        //split the sentence first
        String[] words = sentence.split(" ");

        //get the frequency of each word
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            //remove empty words

            if (word.isEmpty()) {
                continue;
            }

            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        //sort the freq in ascending order
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(freq.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue()); //descending order


//pick the 3 most frequent words
        List<String> topFreq = new ArrayList<>();

        for (int i = 0; i < Math.min(3, sorted.size()); i++) {
            topFreq.add(sorted.get(i).getKey());
        }

        //sort using collections sort method
        Collections.sort(topFreq);

//        return result

        return topFreq;
    }


}
