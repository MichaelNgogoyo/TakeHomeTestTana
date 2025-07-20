public class Question5_ClosesMinDistance {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,5,2};
       int result = closestMinDistance(nums);

        System.out.println("Distance between two closest minimu is: "+result);
    }
    public static int closestMinDistance(int [] a){
        //find the min value in array
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        //find  indixes where the min value occurs
        // do compare all pairs and do find the smallest distance
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == min) {
                        int distance = j - i;
                        if (distance < minDistance) {
                            minDistance = distance;
                        }
                        break; // stop at first next match (or remove to find all)
                    }
                }
            }
        }

        return minDistance;
    }
}
