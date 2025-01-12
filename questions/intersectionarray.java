package questions;

import java.util.ArrayList;

public class intersectionarray {
    public static void inst(int[] arr1, int[] arr2, int[] arr3){
       ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                for(int k=0; k<arr3.length; k++){
                    if(arr1[i]==arr2[j]&&arr1[i]==arr3[k]&& arr2[j]==arr3[k]){
                        list.add(arr1[i]);
                        break;
                    }
                }
               
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int [] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        
        inst(arr1, arr2, arr3);
        }
    }
    

