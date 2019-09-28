package Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode("song");

        node1.makeLeftSubTree(node2);
        node1.makeRightSubTree(node3);
        node2.makeLeftSubTree(node4);

        // node1 노드의 왼쪽 자식의 데이터 출력
        System.out.println(node1.getLeftSubTree().getData());
        // node1 노드의 오른쪽 자식의 데이터 출력
        System.out.println(node1.getRightSubTree().getData());
    }
}
