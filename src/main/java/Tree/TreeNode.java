package Tree;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private Object data;

    TreeNode(Object item){
        left = null;
        right = null;
        data = item;
    }

    // 자신과 왼쪽 자식 노드(sub)와 연결해주는 method
    public void makeLeftSubTree(TreeNode sub){
        if(this.left != null) this.left = null;
        this.left = sub;
    }

    // 자신과 오른쪽 자식 노드(sub)와 연결해주는 method
    public void makeRightSubTree(TreeNode sub){
        if(this.right != null) this.right = null;
        this.right = sub;
    }

    // 자신의 데이터를 반환하는 함수
    public Object getData(){
        return this.data;
    }

    // 자신의 왼쪽 자식 노드를 반환하는 함수
    public TreeNode getLeftSubTree(){
        return this.left;
    }

    // 자신의 오른쪽 자식 노드를 반환하는 함수
    public TreeNode getRightSubTree(){
        return this.right;
    }

    // # 중위 순회 방식 in-order traversal
    void inOrderTraversal(TreeNode node){
        if(node != null){
            inOrderTraversal(node.left);
            // # visit(node); visit이 의미하는것
            inOrderTraversal(node.right);
        }
    }

    // # 전위 순회 방식
    void preOrderTraversal(TreeNode node){
        if(node != null){
            // # visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);

        }
    }

    // # 후위 순회 방식
    void postOrderTraversal(TreeNode node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            // # visit(node);
        }
    }
}
