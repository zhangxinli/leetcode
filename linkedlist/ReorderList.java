package linkedlist;

public class ReorderList {
	 public void reorderList(ListNode head) {
	      if (head == null || head.next == null)
	          return;
	      ListNode pre = null ,slow =head,fast =head ;

	      while (fast != null && fast.next != null) {
	    	  pre = slow;
	    	  slow = slow.next;
	    	  fast = fast.next.next;
	      }

	      pre.next = null;
	      ListNode tail = reverse(slow) ;
	      merge(head,tail);
	      
	    }
	    private void merge(ListNode l1, ListNode l2) {
	      while (l1 != null) {
	        ListNode n1 = l1.next, n2 = l2.next;
	        l1.next = l2;

	        if (n1 == null)
	          break;

	        l2.next = n1;
	        l1 = n1;
	        l2 = n2;
	      }
	    }
	    
	    private  ListNode reverse(ListNode head){
	    ListNode prev = null, curr = head, next = null;

	      while (curr != null) {
	        next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	      }

	      return prev;
	    }
}	
