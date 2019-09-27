package Stack;

public class StackTest {

    public static void main(String[] args) {

        //  크기 5의 배열 스택 생성
        ArrayStack arrayStack = new ArrayStack(5);

        System.out.println("ArrayStack 테스트");

        // 스택에 데이터 삽입
        for (int i = 1; i <= 5; i++) {
            arrayStack.push("ArrayStack 데이터 - " + i);
        }

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        //System.out.println(arrayStack.peek());

        System.out.println();

        ListStack listStack = new ListStack();

        for (int i = 1; i <= 5; i++) {
            listStack.push("ListStack 데이터 - " + i);
        }

        listStack.push("ListStack 데이터 - 6");

        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.peek());
        System.out.println(listStack.peek());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
        System.out.println(listStack.peek());
    }
}
