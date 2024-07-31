class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node Next=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
}
