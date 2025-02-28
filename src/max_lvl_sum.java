import java.util.LinkedList;
import java.util.Queue;

public class max_lvl_sum
{
    public int maxLevelSum(TreeNode root)
    {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int lvl = 1;
        int maxlvl = 0;

        while(!q.isEmpty())
        {
            int lvlsize = q.size();
            for(int i = 0; i < lvlsize; i++)
            {
                TreeNode cur = q.remove();
                sum += cur.val;
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            if (sum > max)
            {
                max = sum;
                maxlvl = lvl;
            }
            sum = 0;
            lvl++;
        }
        return maxlvl;
    }
}
