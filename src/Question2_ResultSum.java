import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Question2_ResultSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

       int result =  resultSum(nums, 10);
        System.out.println("result is "+result);
    }

    public static int resultSum(int[] numbers, int target) {

        //This one will store new or unique combinations
        HashSet<String> uniqueCombinations = new HashSet<>();

        //Here we will hold current path
        ArrayList<Integer> temporaryList = new ArrayList<>();

        //trying to access all starting points
        for (int i =0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                // add number to current combination
                temporaryList.add(numbers[j]);

                int total =0;

                //computing sum manually
                for (int val : temporaryList){
                    total += val;

                }

                if (total == target){

                    //sort so that the combinations does not matter whatever character starts
                    Collections.sort(temporaryList);

                    //add to set
                    uniqueCombinations.add(temporaryList.toString());
                }

                //forgot to backtrack correctly
                temporaryList.remove(temporaryList.size()-1);
            }
        }
        //return how many unique ways
        return uniqueCombinations.size();
    }

}
