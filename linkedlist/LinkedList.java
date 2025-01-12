package linkedlist;

public class LinkedList {
    public  static class Node{
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

        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail =newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        public void printll(){
            if(head == null){
                System.out.print("ll is empty");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        //adding elelments in middle
        public void add(int idx, int data){
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int remove(){
            
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        //searching linear
        public int search(int key){
            Node temp =head;
            int i=0;
            while(temp!= null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        public int helper(Node head, int key){
            if(head==null){
                return -1;
            }
            if(head.data == key){
                return 0;
            } 
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }

        // searching using recursion 
        public int search2(int key){
           return helper(head, key);
        }

        public void reverse(){
            Node curr = tail = head;
            Node prev = null;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public  static boolean isCycle(){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow== fast){
                    return true;
                }
            }
            return false;
        }

        public static void removeCycle(){
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }
            Node prev = null;
            slow = head;
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;

            }
            prev.next =null;
        }
        public Node getmid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // its the mid
        }
        public Node merge(Node head1, Node head2){
            Node mergell  = new Node(-1);
            Node temp = mergell;
            while(head1!=null && head2!=null){
                if(head1.data<=head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            while(head1!=null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2!=null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergell.next;
        }

        public Node mergesort(Node head){
            if(head==null || head.next == null){
                return head;
            }
            Node mid = getmid(head);
            Node righthead = mid.next;
            mid.next = null;
            Node newleft = mergesort(head);
            Node newright = mergesort(righthead);

            return merge(newleft, newright);
        }
        public void zigzag(){
            //find the mid
            Node slow = head;
            Node fast = head.next;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;
            Node curr = mid.next;
            mid.next = null;
             //reverse the righthalf
             Node prev = null;
             Node next;
             while(curr!=null){
                next= curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
             }
             //turn it into zigzag
             Node left = head;
             Node right = prev;
             Node nextl, nextr;

             while(left!=null && right!=null){
                nextl = left.next;
                left.next = right;
                nextr = right.next;
                right.next = nextl;

                left = nextl;
                right = nextr;

             }
        }
    

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();        
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addLast(4);
        // ll.addLast(6);
        // ll.add(2, 9);
        
        // ll.printll();
        // ll.reverse();
        // ll.printll();
        // head = new Node(1);
        // Node temp  = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printll();
        // ll.head = ll.mergesort(ll.head);
        ll.zigzag();
        ll.printll();

    }
}
    

