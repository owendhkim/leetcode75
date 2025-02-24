import java.util.ArrayList;

public class leaf_similar_trees
{
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>();
    public void dfs(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        if(root.left == null && root.right == null)
        {
            l1.add(root.val);
        }
    }
    public void dfs2(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        dfs2(root.left);
        dfs2(root.right);
        if(root.left == null && root.right == null)
        {
            l2.add(root.val);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        dfs(root1);
        dfs2(root2);
        return l1.equals(l2);
    }
}
