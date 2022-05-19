import java.util.ArrayList;

public class Myutility {
    public static<T> void iterateList(ArrayList<T> List) {
        for (T temp : List) {
            System.out.println(temp);
        }
    }
}
