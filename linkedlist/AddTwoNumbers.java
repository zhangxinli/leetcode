package leetcode.linkedlist;

public class AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int carry=0;
	        ListNode head=new ListNode(0);
	        ListNode last=head;
	        while(l1!=null||l2!=null||carry!=0){
	             carry+=(l1==null?0:l1.val)+(l2==null?0:l2.val);
	            last.next =new ListNode(carry%10) ;
	            carry /=10 ;
	            last =last.next ;
	            l1= l1==null?null:l1.next ;
	             l2= l2==null?null:l2.next ;
	        }
	        return head.next ;
	       
	    }
}
