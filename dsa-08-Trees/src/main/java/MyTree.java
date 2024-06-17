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

}
