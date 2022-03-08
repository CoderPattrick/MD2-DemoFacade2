import java.util.ArrayList;

public class ListFilter {
    ArrayList<Integer> filterOdd(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i:list
             ) {
            if(i%2==0){
                temp.add(i);
            }
        }
        return temp;
    }
}
