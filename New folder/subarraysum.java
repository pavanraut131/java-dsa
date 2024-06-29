public class subarraysum {
    public static void subarray(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
             int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                for(int k=start; k<numbers.length; k++){
                    currsum += numbers[k];
                };
                System.out.print(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                };
                System.out.println();
            };
            System.out.println();
        };
        System.out.println("maxsum:"+maxsum);
    };
    public static void main(String[] args){
        int numbers[] = {2,4,6,8};
        subarray(numbers);
    };
    
};
