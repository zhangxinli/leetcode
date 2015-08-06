package linkedlist;

class RotateList {
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null) return null ;
	         k = k % getLengh(head);
	        ListNode dummy = new ListNode(0) ;
	        dummy.next =head ;
	         ListNode pre =dummy ;
	         ListNode fast =dummy ;
	       /*  for (int i = 0; i < k; i++) {
	            fast = fast.next;
	         }*/
	         while(fast.next!=null){
	            pre = pre.next ;
	             fast =fast.next ;
	          
	         }
	        ListNode node =dummy.next ;
	        dummy.next =pre.next ;
	        pre.next =null ;
	        fast.next =node;
	        return dummy.next ;
	    }
	    private int getLengh(ListNode node) {
	    int count = 0;
	    while (node != null) {
	        count++;
	        node = node.next;
	    }
	    return count;
	}
}
