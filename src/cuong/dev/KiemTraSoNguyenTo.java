package cuong.dev;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static int songuyento(int n) {
    	 if(n<2) {
    		 return 0;
    	 }
    	 else {
    		 for(int i=2;i<(n-1);i++) {
    			 if(n%i==0) {
    				 return 0;
    			 }    					 
    		 }
    	 }
    	 return 1;
     }	
    public static void main(String[] agrs) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("nhap n");
    	int n =s.nextInt();
    	s.close();
     if(songuyento(n)==1) {
    	 System.out.println(n+": la so nguyen to");
     }
     else 
    	 System.out.println(n+": khong phai la so nguyen to");
    }   
 }

