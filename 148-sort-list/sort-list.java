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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
       ListNode midNode = middleElement(head);

       ListNode nextNode = midNode.next;
       midNode.next = null;
       ListNode leftNode = sortList(head);
       ListNode rightNode = sortList(nextNode);

        return mergeLinkedList(leftNode,rightNode);
    }

    private ListNode mergeLinkedList(ListNode A, ListNode B){
        // if(A==null || B==null){
        //     return A==null ? B : A;
        // }
        ListNode tempNode = new ListNode(0);
        ListNode tail = tempNode;
        while(A!=null && B!=null){
            if(A.val<=B.val){
                tail.next = A;
                A = A.next;
                tail = tail.next;
                tail.next = null;
            }else{
                tail.next = B;
                B = B.next;
                tail = tail.next;
                tail.next = null;
            }
        }
           tail.next = A!=null ? A : B;
        // tail = tempNode;
        // tempNode = tail.next;

        return tempNode.next;
    }

    private ListNode middleElement(ListNode A){
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null && fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}