import java.util.ArrayList;
import java.util.List;

public class StalinSort {
    public static void main(String args[]) {

        List<Integer> array = new ArrayList<>();

        int size = 50;
        for (int i = 0; i < size; i++) {
            int j = (int) (Math.random() * 1000);
            array.add(j);
        }
        
        for(int i = 0; i < size/2; i++) {
            if (array.get(i) >= array.get(i+1)) {
                array.remove(i);
            }
            
        }
    }
}