public class Question3_ArrayAllZero {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int result = arrayAllZero(nums);
        System.out.println(result);
    }

    public static int arrayAllZero(int[] a) {

        //if array is null, return invalid input
        if (a == null || a.length == 0) {
            System.out.println("Input array is empty");
            return -1;
        }

        //make a copy of original array so that we dont modify the original array
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        //a boolean to track of there is a change in our array a
        boolean changed = true;
        int operationCount = 0;
        //keep trying until nothing changes
        while (changed) {
            //first change the value of boolean to false(flag),
            changed = false;
            //loop throgh the array and reduce it accordingly

            //create a copy to compare after this round
            int[] previous = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                previous[i] = arr[i];
            }

            //try reduce each element by subtracting 1 if possible
            for (int i = 1; i < arr.length; i++) {
                //if arr[i] > 0 and arr[i-1] > 0, we can reduce arr[i]
                if (arr[i] > 0 && arr[i - 1] > 0) {
                    int original = arr[i];

                    arr[i] = arr[i] - arr[i - 1];

                    changed = true;

                    System.out.println("updated array [ " + i + "]:" + original + " -> " + arr[i]);
                }
            }
        }
        //check if all elements except the first are 0
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("All elements after index 0 are not 0.");
                return 0;
            }
        }
        System.out.println("All elements after 0 index are all 0.");
        return 1;
    }
}