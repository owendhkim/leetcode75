public class lowest_common_ancestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null) return null;
        if(root == p || root == q) return root;

        TreeNode l = lowestCommonAncestor(root.left, p,q);
        TreeNode r = lowestCommonAncestor(root.right, p,q);

        if(r == null) return l;
        else if(l == null) return r;
        else return root;
    }
}