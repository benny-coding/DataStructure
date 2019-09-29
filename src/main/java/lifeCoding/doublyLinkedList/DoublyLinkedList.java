package lifeCoding.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;
        private Node prev;  // 추가

        public Node(Object input){
            this.data = input;
            this.next = null;
            this.prev = null; // 추가
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;

        if(head != null)
            head.prev = newNode;
        head = newNode;
        size++;

        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(Object input){
        Node newNode = new Node(input);
        if(tail == null){
            addFirst(input);
        } else {
            tail.next = newNode;
            if(tail != null)
                newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    Node node(int index){
        Node x = head;
        for (int i = 0; i < index ; i++) {
            x = x.next;
        }

        return x;
    }

    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }

        }
    }

    public Object removeFirst(){
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int k){
        if(k == 0){
            return removeFirst();
        }
        Node temp = node(k-1);
        Node tododeleted = temp.next;
        temp.next = temp.next.next; // # 해당 코드는 NullPointerexception 발생함 예외처리가 필요
        Object returnData = tododeleted.data;
        if(tododeleted == tail){
            tail = temp;
        }
        tododeleted = null;
        size--;
        return returnData;
    }

    public Object removeLast(){
        return remove(size-1);

    }
    public int size(){
        return size;
    }

    public Object get(int k){
        Node temp = node(k);
        if(temp != null) {
            return temp.data;
        } else {
            return "";
        }
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while(temp.data != data){
            temp = temp.next;
            index++;
            if(temp == null){
                return -1;
            }
        }
        return index;

    }

    public String toString(){
        if(head == null){
            return "[]";
        }

        Node temp = head;
        String str = "[";

        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public ListIterator listIterator(){
        return new ListIterator();
    }

    public class ListIterator{
        private Node next;
        private Node lastReturned;
        private int nextIndex;

        ListIterator(){
            next = head;
        }

        public Object next(){
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        public void add(Object input){
            Node newNode = new Node(input);

            if(lastReturned == null){ // 노드가 없는 상태에서 첫번째 추가이면
                head = newNode;	// 새로운 노드를 head로 가리키고
                newNode.next = next;	// 새로운 노드의 next는 next 노드를 가리킵니다.
            } else {
                lastReturned.next = newNode;	// 새로운 노드를 lastReturned의 next로 연결시키고
                newNode.next = next;	// next는 새로운 노드의 next로 연결시킵니다.
            }
            lastReturned = newNode;	// 새로운 노드를 리턴할 노드로 정한 후
            nextIndex++;	// next의 index 증가와
            size++;	// size도 증가시킵니다.
        }

        public void remove(){
            if(nextIndex == 0){
                throw new IllegalStateException();
            }
            DoublyLinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }

    }


}
