import java.util.HashMap;

class path_sum_tree {
    int count = 0;
    HashMap<Long, Integer> hm = new HashMap<>();
    public int pathSum(TreeNode root, int targetSum)
    {
        dfs(root,0,targetSum);
        return count;
    }
    public void dfs(TreeNode n, long prefixsum, int targetSum)
    {
        if(n == null) return;

        prefixsum = prefixsum + n.val;

        if(hm.containsKey(prefixsum-targetSum))
        {
            count = count + hm.get(prefixsum-targetSum);
        }
        if(prefixsum == targetSum) count++;

        hm.put(prefixsum, hm.getOrDefault(prefixsum, 0) + 1);

        dfs(n.left, prefixsum, targetSum);
        dfs(n.right, prefixsum, targetSum);

        hm.put(prefixsum, hm.get(prefixsum) - 1);
    }
}