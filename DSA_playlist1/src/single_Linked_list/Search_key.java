package single_Linked_list;
//Defination of ListNoode
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}


public class Search_key {
	 public boolean searchKey(ListNode head, int key) {
	        // Your code goes here
	       ListNode current = head;
	       while(current != null){
	            if(current.val == key)
	                return true;
	            current = current.next;
	       }

	        return false;
	    }
}
