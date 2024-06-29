import java.util.*;
public class fun{

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialcoeff(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bincoeef = a/(b*c);
        return bincoeef;
    }
    


    public static void main(String args[]){
        System.out.println(binomialcoeff(5, 2));
      
    }

    }

