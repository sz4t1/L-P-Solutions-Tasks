public class SearchInTheTree {
    //Recursive function to find the right node
    public TreeNode traversal(TreeNode node,int search){
        TreeNode actual=node;
        if (actual.getValue()==search ) return actual;
            if (node.getLeft() != null)
                actual=traversal(node.getLeft(), search);
        if (actual.getValue()==search ) return actual;
            if (node.getRight() != null)
                actual=traversal(node.getRight(), search);
            return actual;

    }
    //Recursive function to get the sum of the nodes under the "root"
    public int traversalGetSum(TreeNode node){
        if( node==null) return 0;

        return node.getValue()
                +traversalGetSum(node.getRight())
                +traversalGetSum(node.getLeft());
    }
    //The function that uses the two recursive function to find the searched sum of tree nodes
    public Integer SearchInTheBinaryTree(TreeNode root,int search){
        TreeNode actual;
        actual=traversal(root,search);
        if (actual==null) return null;
        Integer searched=traversalGetSum(actual)-actual.getValue();
        if(searched==0) return null;
        return searched;
    }
}
