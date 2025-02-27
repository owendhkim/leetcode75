public class maximum_depth_of_tree
{
    int max = 0;
    public int maxDepth(TreeNode root)
    {
        dfs(root, 0);
        return max;
    }
    public void dfs(TreeNode r, int currentDepth)
    {
        if (r == null) {
            return;
        }
        currentDepth++;

        if (currentDepth > max)
        {
            max = currentDepth;
        }
        dfs(r.left, currentDepth);
        dfs(r.right, currentDepth);
    }
}