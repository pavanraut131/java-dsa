package pattern;
public class countwords {
    public static int[] countwords2(String paragraph, String[] wordscount){
        String[] words =paragraph.split("\\W+");
        int[] count = new int[wordscount.length];

        for(String word : words){
            for(int i=0; i<wordscount.length; i++){
                if(word.equalsIgnoreCase(wordscount[i])){
                    count[i]++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String paragraph =  "This is a sample paragraph. This paragraph is meant for counting words. Counting words is fun.";
        String[] wordscount = {"This", "is", "paragraph", "words"};
        int[] counts = countwords2(paragraph, wordscount);
            
        for(int i=0; i<wordscount.length; i++){
            System.out.println(wordscount[i] +" " +counts[i]);
        }


    }
}
