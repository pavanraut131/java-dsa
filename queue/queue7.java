// package queue;
public class queue7 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size= n;
            rear = -1;
            front = -1;
        }
        
        public static boolean isempty(){
             return rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        public static void enqueue(int data){
            if(isfull()){
                System.out.println("the queue is full");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
         public static int deque(){
            if(isempty()){
                System.out.println("the queue is empty");
                return -1;
            }

           int result  = arr[front];
            front = (front+1)%size;
            if(front == rear){
                rear=front=-1;
            }
            return result;
         }

         public static int peek(){
            if(isempty()){
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[front];
         }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(8);
        q.enqueue(3);
        System.out.println(q.deque());
        q.enqueue(4);
        System.out.println(q.deque());
        q.enqueue(5);

        while(!q.isempty()){
            System.out.println(q.peek());
            q.deque();
        }
    }
}
