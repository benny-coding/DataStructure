package Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode Tree = new TreeNode();

        Node t6 = Tree.createNode(null,6,null);
        Node t5 = Tree.createNode(null,5,null);
        Node t4 = Tree.createNode(null,4,null);
        Node t3 = Tree.createNode(null,3,t6);
        Node t2 = Tree.createNode(t4,2,t5);
        Node t1 = Tree.createNode(t2,1,t3);

        Tree.setRoot(t1);
        System.out.println("중위 순회방식");
        Tree.inOrder(t1);
        System.out.println("전위 순회방식");
        Tree.preOrder(t1);
        System.out.println("후위 순회방식");
        Tree.postOrder(t1);
    }
}
