import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //Task 1 with the test data
        ListOperator listOperator = new ListOperator();
        List<Integer> firstList=(Arrays.asList(5, 9, 7,3,8));
        List<Integer> secondList=(Arrays.asList(4, 1, 7));
        List<Integer> outList= listOperator.getSum(secondList,firstList);
        System.out.println(outList);

        //Task 2 with the test data
        SearchInTheTree sitt=new SearchInTheTree();
        TreeNode tree=new TreeNode(3);
        tree.setLeft(new TreeNode(5));
        tree.getLeft().setLeft(new TreeNode(7));
        tree.setRight(new TreeNode(1));
        tree.getRight().setLeft(new TreeNode(2));
        tree.getRight().setRight(new TreeNode(0));
        tree.getRight().getRight().setRight(new TreeNode(-4));

        Integer search0=sitt.SearchInTheBinaryTree(tree,1);
        System.out.println("First search in the tree:"+search0);
        Integer search1=sitt.SearchInTheBinaryTree(tree,-4);
        System.out.println("Second search in the tree:"+search1);
        Integer search2=sitt.SearchInTheBinaryTree(tree,8);
        System.out.println("Third search in the tree:"+search2);
        Integer search3=sitt.SearchInTheBinaryTree(tree,5);
        System.out.println("Fourth search in the tree:"+search3);
    }
}
