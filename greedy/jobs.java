package greedy;

import java.util.ArrayList;
import java.util.Collections;

public class jobs {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id=i;
            deadline = d;
            profit= p;
        }
    }
    public static void main(String [] args){
        int jobinfo[][] = {{4, 20}, {1, 20}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobinfo.length; i++){
            jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit-a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    
}
