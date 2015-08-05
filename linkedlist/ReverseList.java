package linkedlist;

public class ReverseList {
	class ListNode {
		     int val;
		     ListNode next;
		      ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		ReverseList rl = new ReverseList() ;
		ListNode node1 = rl.new ListNode(1) ;
		ListNode node2 = rl.new ListNode(2) ;
		ListNode node3 = rl.new ListNode(2) ;
		node1.next =node2 ;
		node2.next =node3 ;
		deleteDuplicates(node1) ;
	}
	 public static ListNode  deleteDuplicates(ListNode head) {
		 ReverseList rl = new ReverseList() ;
	        ListNode dummy =rl.new ListNode(0) ;
	        dummy.next = head ;
	        ListNode pre =  dummy;
	        ListNode first = dummy.next ;
	        ListNode last = dummy.next ;
	        while(last!=null){
	           while(last.next!=null&&last.val==last.next.val){
	               last =last.next ;
	           }
	           if(first.val==last.val&&last!=first){
	               pre.next =last.next ;
	           }else{
	        	   pre =last ;
	           }
	           last = last.next ;
	           first =last ;
	        }
	        return dummy.next ;
	    }
	 public static ListNode reverseKGroup(ListNode head, int k) {
		 ReverseList rl = new ReverseList() ;
	        ListNode dummy = rl.new ListNode(0) ;
	        dummy.next = head ;
	        ListNode fast = dummy ;
	        ListNode pre= dummy ;
	        int count = 0 ;
	        while(fast!=null){
	            if(count==k){
	            	pre = insert(pre,k) ;
	            	fast =pre ;
	                count=0 ;
	            }else{
	                fast =fast.next ;
	                count++ ;
	               
	            }
	        }
	        return dummy.next ;
	    }
	    private static ListNode insert(ListNode pre,int k){
	        ListNode temp = pre.next ;
	        if(temp==null) return temp ;
	        ListNode next = temp.next ;
	        while(next!=null&&k>1){
	          temp.next =next.next ;
	          next.next = pre.next ;
	          pre.next =next ;
	          next =temp.next ;
	          k--;
	        }
	        return temp ;
	    }
}
