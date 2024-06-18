public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();

        int[] nums = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < nums.length; i++) {
            tree.insert(nums[i]);
        }

        VisualizeTree.printTree(tree.root,null,false);

        System.out.println("========================================");
        System.out.println("Pre-order Traversal of the tree");
        tree.preOrderTraversal(tree.root);

    }
}
