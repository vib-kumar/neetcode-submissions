/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists ==null || lists.length ==0){
        return null;
        }
        return mergeList(lists,0,lists.length-1);

    }

    private ListNode mergeList(ListNode[] lists, int s , int e){
        if(s > e){
            return null;
        }
        if(s == e){
            return lists[s];
        }
     int mid = (s+e)/2;
     ListNode left = mergeList(lists,s,mid);
     ListNode right = mergeList(lists,mid+1,e);

     return merge(left,right);

    }

    private ListNode merge(ListNode l, ListNode r){
       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;
       while (l != null && r != null) {
        if (l.val <= r.val) {
            curr.next = l;
            l = l.next;
        } else { 
            curr.next = r;
            r = r.next;
        }
        curr = curr.next;
       }

       if (l != null){
        curr.next = l;
       }
       else {
        curr.next = r;
       }
       
       return dummy.next;
    }
}
