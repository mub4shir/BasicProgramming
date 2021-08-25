public class MyLinkedList {
    public class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    private Node head;

    public void addAtfirst(int data){
        Node nn = new Node(data);
        nn.next=head;
        head=nn;
    }
    public void printList(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void pritnNthFromEnd(int n){
        Node temp1=head;
        Node temp2=head;
        for (int i=1;i<n;i++){
            temp1=temp1.next;
        }
        while(temp1.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println(temp2.data);
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        for (int i = 9; i>0 ; i--) {
            ll.addAtfirst(i);
        }
        ll.printList();
        ll.pritnNthFromEnd(2);
    }
}
