import java.util.ArrayList;
import java.util.List;

public class Question7_RotateList {
    public static void main(String[] args) {

        List<String> mainList = new ArrayList<>();
        mainList.add("ID_A01");
        mainList.add("ID_A02");
        mainList.add("ID_A03");
        mainList.add("ID_A04");
        mainList.add("ID_A05");
        mainList.add("ID_A06");

        List<String> rotatedList = rotateList(mainList, 2);

        for (int i =0; i<rotatedList.size(); i++){
            System.out.print(rotatedList.get(i)+", ");
        }
    }

    public static List<String> rotateList(List<String> list, int n) {
        int len = list.size();

        //handle rotation values large than the list size
        n = n % len;
        //a list to store rotated result
        ArrayList<String> rotated = new ArrayList<>();

        //add last n elements first, its like a swap maybe
        rotated.addAll(list.subList(len - n, len));
        //add the rest here
        rotated.addAll(list.subList(0, len - n));

        //return the rotated list
        return rotated;
    }
}
