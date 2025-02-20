public class max_twin_sum_lnkdlst
{
    public int pairSum(ListNode head)
    {
        ListNode h = head;
        int n = 1;
        while(h.next != null)
        {
            h = h.next;
            n++;
        }
        h = head;
        for(int i = 0; i < (n / 2); i++)
        {
            h = h.next;
        }
        ListNode cur = h;
        ListNode prev = null;
        while(cur != null)
        {
            ListNode nexttmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nexttmp;
        }
        int max = 0;
        ListNode left = head;
        ListNode right = prev;
        for(int i = 0; i < (n / 2); i++)
        {
            if((left.val + right.val) > max)
            {
                max = left.val + right.val;
            }
            left = left.next;
            right = right.next;
        }
        return max;
    }
}
