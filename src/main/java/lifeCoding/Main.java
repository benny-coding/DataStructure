package lifeCoding;

import lifeCoding.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        LinkedList.ListIterator i = numbers.listIterator();
        i.add(5);
        System.out.println(i.next());
        i.add(15);
        System.out.println(i.next());
        System.out.println(i.next());

        System.out.println(numbers);
    }
}
