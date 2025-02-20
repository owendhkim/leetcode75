public class odd_even_linkedlist
{
    public ListNode oddEvenList(ListNode head)
    {
        if (head == null || head.next == null) return head;

        ListNode oddhead = head;
        ListNode evenhead = head.next;
        ListNode evenheadtmp = head.next;

        while(true)
        {
            if(oddhead.next == null || evenhead.next == null)
            {
                break;
            }
            oddhead.next = evenhead.next;
            oddhead = evenhead.next;
            evenhead.next = oddhead.next;
            evenhead = oddhead.next;
        }
        oddhead.next = evenheadtmp;
        return head;
    }
}
