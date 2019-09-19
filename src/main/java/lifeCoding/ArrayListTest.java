package lifeCoding;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(1,15);

        numbers.remove(0);

        numbers.get(0);

        System.out.println(numbers.get(0));
    }
}
