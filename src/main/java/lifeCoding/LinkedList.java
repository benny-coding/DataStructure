package lifeCoding;

import lifeCoding.doublyLinkedList.DoublyLinkedList;

public class  LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input){
            this.data = input;
            this.next = null;
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input); // input 값으로 Node를 인스턴스화 하여 newNode를 초기화
        newNode.next = head;	// 기존의 head 값은 newNode 객체의 next 변수가 되고
        head = newNode;		// newNode 객체는 새로운 head가 됩니다
        size++;			// 새로운 노드가 생겼으니 size를 증가시켜줍니다

        if(head.next == null){  // head의 next값이 null이라는 의미는 현재 head가 마지막 노드라는 의미이므로
            tail = head;	// head의 값이 tail이기도 하다는 뜻이기도 합니다
        }
    }

    public void addLast(Object input){
        Node newNode = new Node(input);
        if(tail == null){
            addFirst(input);
        } else {
            tail.next = newNode;
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
            //DoublyLinkedList.this.remove(nextIndex-1);
            //nextIndex--;
        }

    }


}
