package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priority {
     static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank  = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
     }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("pavan", 4));
        pq.add(new Student("dilkhush", 2));
        pq.add(new Student("deepak", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" ->"+ pq.peek().rank);
            pq.remove();    
        }
    }
    
}
