import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;


    void insert(int value) {
        TNode node = new TNode(value);

        if (root == null) {
            root = node;
            return;
        }

        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild; // if left is not null branch left
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild; // if right is not null branch right
            }
        }
    }

    //Depth first

    //root - left - right
    void preOrderTraversal(TNode root) {
        if (root == null) return; //termination
        System.out.print(root.value + ", ");// visit root
        preOrderTraversal(root.leftChild);// visit left subtree
        preOrderTraversal(root.rightChild);// visit right subtree
    }

    //left - root - right
    void inOrderTraversal(TNode root) {
        if (root == null) return; //termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    //left - right - root
    void postOrderTraversal(TNode root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }

    //Breadth first
    void levelOrderTraversal(TNode root) {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }

    TNode leftRotate(TNode node){
        TNode temp = node.rightChild;
        node.rightChild = temp.leftChild;
        temp.leftChild = node;
        return temp;
    }

    TNode rightRotate(TNode node){
        TNode temp = node.leftChild;
        node.leftChild = temp.rightChild;
        temp.rightChild = node;
        return temp;
    }

    TNode rightLeftRotation(TNode node){
        node.rightChild = rightRotate(node.rightChild);
        return leftRotate(node);
    }

    TNode leftRightRotation(TNode node){
        node.leftChild = leftRotate(node.leftChild);
        return rightRotate(node);
    }
}
