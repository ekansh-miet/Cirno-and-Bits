import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        int w=(int)(x & -x);
        while((w^x)==0 || (w&x)==0)
        w++;
        System.out.println(w);        
    }
}