package Stack;

public class ListStack {

    private Node top;

    public class Node{

        private Object data;
        private Node nextNode;

        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }

    // 생성자, stack이 비어 있으므로 top은 null이다
    public ListStack(){
        this.top = null;
    }

    // 스택이 비어 있는지 확인
    public boolean empty(){
        return (top == null);
    }

    // item을 스택의 top에 넣는다
    public void push(Object item){

        Node newNode = new Node(item);
        newNode.nextNode = top;
        top = newNode;

    }

    // top 노드의 데이터 반환한다
    public Object peek(){
        if(empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return top.data;
    }

    public Object pop(){

        Object item = peek();
        top = top.nextNode;
        return item;
    }
}
