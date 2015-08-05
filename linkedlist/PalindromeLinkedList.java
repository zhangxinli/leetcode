package linkedlist;

/**
* 双指针，找到中间节点
*
*/
public class PalindromeLinkedList {
	 public boolean isPalindrome(ListNode head) {
	        if(head==null) return true ;
	        ListNode slow =head ;
	        ListNode fast =head.next ;
	        while(fast!=null&&fast.next!=null){
	            slow = slow.next ;
	            fast = fast.next.next ;
	        }
	       ListNode tail = reverse(slow) ;
	       while(head!=null&&tail!=null){
	           if(head.val!=tail.val){
	               return false;
	           }
	           head =head.next ;
	           tail =tail.next ;
	       }
	       return true ;
	    }
	    public ListNode reverse(ListNode node){
	        ListNode dummy = new ListNode(0) ;
	        ListNode temp =node ;
	        while(node!=null){
	            temp = node.next ;
	            node.next =dummy.next ;
	            dummy.next =node ;
	            node =temp ;
	        }
	        return dummy.next ;
	    }
}
