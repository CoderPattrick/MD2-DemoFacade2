import java.util.ArrayList;
import java.util.Random;

public class RanNumb implements iRanNumb{
    @Override
    public ArrayList<Integer> generateLists() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }
}
