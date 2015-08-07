package linkedlist;

public class Merge_k_Sorted_Lists {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(-2) ;
		ListNode node2 = new ListNode(-3) ;
		ListNode node3 = new ListNode(-2) ;
		ListNode node4 = new ListNode(-1) ;
		node2.next=node3 ;
		node3.next =node4;
		ListNode[] lists ={null,node1,node2} ;
		mergeKLists(lists) ;
	}
	 public static ListNode mergeKLists(ListNode[] lists) {
	        if(lists==null||lists.length==0) return null;
	        int len =lists.length;
	        while(len>0){
	            for(int i = 0 ;i<(len+1)/2 ;i++){
	              ListNode newNode =  merge(lists[i],lists[len-1-i]) ;
	              lists[i] =newNode ;
	            }
	            if(len==1||len==2) break ;
	            len =(len+1)/2 ;
	        }
	        return lists[0] ;
	        
	    }
	    private static ListNode merge(ListNode l1 ,ListNode l2){
	        if(l1==l2) return l1 ;
	        ListNode dummy = new ListNode(0) ;
	        ListNode node = dummy ;
	        while(l1!=null&&l2!=null){
	            if(l1.val<l2.val){
	                node.next =l1 ;
	                l1=l1.next ;
	            }else{
	                node.next =l2 ;
	                l2 =l2.next ;
	            }
	             node=node.next;
	        }
	        if(l1!=null){
	            node.next =l1 ;
	        }
	        if(l2!=null){
	            node.next=l2 ;
	        }
	        return dummy.next ;
	    }
}
