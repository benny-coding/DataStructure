package Tree;

class Node{
    int data;
    Node left;
    Node right;
}

class TreeNode{
    public Node root;

    public void setRoot(Node node){
        root = node;
    }

    public Node getRoot (){
        return root;
    }

    public Node createNode(Node left, int data, Node right){
        Node newNode = new Node();
        newNode.left = left;
        newNode.data = data;
        newNode.right = right;

        return newNode;
    }

    // # 중위 순회 방식
    public void inOrder(Node node){
        if(node != null) {
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

    // # 전위 순회 방식
    public void preOrder(Node node){
        if(node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // # 후위 순회 방식
    public void postOrder(Node node){
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

}