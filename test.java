import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in    = scan.nextInt();
        double d = scan.nextDouble();
        String empty = scan.nextLine();  
        String s = scan.nextLine();
        
        for(int i=0; i<s.length(); i++ ){
            if(i%3 == 0) s = s.substring(0, i) + 'x' + s.substring(i + 1);
            s =  (s.charAt(i) == ' ')? s.substring(0, i) + 'A' + s.substring(i + 1) : s.substring(0, i) + 'B' + s.substring(i + 1) ;
            System.out.print(s.charAt(i));
        }
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.print(GCD.int_gcd(4,3));
    }
}

class GCD {
    public static int int_gcd(int a, int b){
        if (b == 0) return a;
        return int_gcd(b, a % b);
    }
}
