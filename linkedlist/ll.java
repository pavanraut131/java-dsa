public class ll{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void printll(){
        if(head == null){
            System.out.print("linked list is empty");
            return;

        }
        Node temp = head;
        while(temp!=null){
             System.out.print(temp.data+" ");
             temp = temp.next;
        }
        System.out.println();
    }
    public void addinmiddle(int idx, int data){
        Node newnode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst(){
        if(size==0){
            System.out.print("LL is empty");
            return 0;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val= head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
         if(size==0){
            System.out.print("LL is empty");
            return 0;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head;
        int i=0;
         while(temp!=null){
            if(temp.data == key){
                return i;
            } else{
                temp= temp.next;
                i++;
            }
         }
         return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deletenthnod(int n){
        int szz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            szz++;
        }
        if(szz==n){
            head = head.next;
            return;
        }
        int idx = 1;
        Node prev= head;
        while(idx<szz-n){
            prev = prev.next;
            idx++;
        }
        prev.next= prev.next.next;
        return;
    }

    public static void main(String args[]){
        ll linkedlist = new ll();
        linkedlist.addfirst(1);
        linkedlist.addfirst(2);
        linkedlist.addlast(3);
        linkedlist.addlast(4);

        linkedlist.addinmiddle(1,5);

        // linkedlist.removefirst();
        // linkedlist.removelast();
       
        // System.out.println(linkedlist.size);
        // System.out.println(linkedlist.recsearch(9));
        // linkedlist.reverse();
        linkedlist.deletenthnod(2);
        linkedlist.printll();
    }
}