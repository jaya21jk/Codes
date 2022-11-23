public int length(ListNode node){
        int i=0;
        ListNode curr = node;
        while(curr!=null){
            i++;
            curr = curr.next;
        }
        return i;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        int len = length(head);
        if(len==1 && n==1) return null;
        else if(len==n) return head.next;
        n = len-n-1;
        ListNode curr = head;
        while(n>0){
            curr = curr.next;
            n--;
        }
        if(curr.next.next==null){
            curr.next = null;
        }else
            curr.next = curr.next.next;
        return head;
    }
