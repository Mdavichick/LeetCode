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
    public ListNode deleteDuplicates(ListNode head) {
        List <Integer> myList = new ArrayList<>();
        ListNode noDup = new ListNode();
        
        if (head == null){
            return head;
        }
        while (head != null){
            if (!myList.contains(head.val)){
                myList.add(head.val);
            }
            head = head.next;  
        }
        
        for (int i = myList.size()-1; i >= 0; i--){
            noDup = new ListNode(myList.get(i), noDup);
        }
        
        ListNode temp = noDup;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        temp = null;
        
        return noDup;
    }
}
