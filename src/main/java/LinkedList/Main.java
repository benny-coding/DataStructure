package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.add(2,25);
        System.out.println(numbers.removeFirst());
        System.out.println(numbers.remove(0));
        System.out.println(numbers.remove(1));
        System.out.println(numbers.removeLast());
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));


        System.out.println(numbers);
    }
}
