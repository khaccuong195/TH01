package cuong.dev;

import java.util.Scanner;

public class TinhGiaiThua {
     public static long gt(int n) {
    	 if(n>1) {
    		 return n*gt(n-1);
    	 }
    	 else
    		return 1; 
     }
    public static void main(String[] agrs) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("nhap n:");
    	int n= s.nextInt();
    	s.close();
    	System.out.println("giai thua cua "+n+" la: "+gt(n));
    } 
}