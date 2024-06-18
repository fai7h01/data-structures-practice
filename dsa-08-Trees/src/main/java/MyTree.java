public class MyTree {

    TNode root;


    void insert(int value){
        TNode node = new TNode(value);

        if (root == null){
            root = node;
            return;
        }

        TNode current = root;
        while(true){
            if (value <= current.value){
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild; // if left is not null branch left
            }else{
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild; // if right is not null branch right
            }
        }
    }

    //root - left - right
    void preOrderTraversal(TNode root){
        if (root == null) return; //termination
        System.out.print(root.value + ", ");// visit root
        preOrderTraversal(root.leftChild);// visit left subtree
        preOrderTraversal(root.rightChild);// visit right subtree
    }

    //left - root - right
    void inOrderTraversal(TNode root){
        if (root == null) return; //termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }
}
