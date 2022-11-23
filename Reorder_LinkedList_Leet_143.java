public ListNode middle(ListNode node){
        ListNode slow = node;
        ListNode fast = node; 
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        int n = sizeof(head);
        //System.out.println(n);
        ListNode mid = middle(head);
        ListNode head2 = mid.next;
        mid.next = null;
        ListNode head22 = reverse(head2);
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        ListNode ss = dummy;
        while(curr!=null && head22!=null){
            dummy.next = curr;
             curr = curr.next;
            dummy = dummy.next;
            dummy.next = head22;
            head22 = head22.next;
            dummy = dummy.next;
        }
        if(curr!=null){
            dummy.next = curr;
        }
        if(head22!=null){
            dummy.next = head22;
        }
        ss = ss.next;
