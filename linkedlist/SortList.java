package ll;
class ListNode{
	  int val;
	  ListNode next;
	  ListNode(int x) { val = x; }
	       }
/**
 * 核心的就是归并排序，来满足O(n log n)  ;
 * @author eversec
 *
 */


public class SortList {
	public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head ;
        ListNode pre = null ;
        ListNode slow = head ;
        ListNode fast =head ;
        while(fast!=null&&fast.next!=null){
            pre =slow ;
            slow= slow.next ;
            fast = fast.next.next ;
        }
       pre.next =null ;
       ListNode l1 = sortList(head) ;
       ListNode l2 = sortList(slow) ;
       return merge(l1,l2) ;
        
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0) ;
        ListNode node =dummy ;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                node.next =l1 ;
                l1 =l1.next ;
            }else{
                node.next= l2 ;
                l2 =l2.next ;
            }
            node = node.next ;
        }
        if(l1!=null){
             node.next =l1 ;
        }
        if(l2!=null){
             node.next =l2 ;
        }
        return dummy.next ;
        
    }
}
