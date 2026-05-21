public class ListNode {
    int val;
    ListNode next;


    public ListNode(int x) {
        this.val = x;
    }

    public static void main(String[] args){

        ListNode l1=new ListNode(67);
        ListNode l2=new ListNode(89);
        ListNode l3=new ListNode(45);
        ListNode l4=new ListNode(23);
        
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        ListNode temp=l1;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }

    }
}
