import java.math.*;
import java.io.*;
import java.util.*;


public class Test
{ 
    public static void main(String[] args)throws IOException 
    { 
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Please Enter a Number");
       
       int n= sc.nextInt();
       
       if(n%2==0)
       {
           System.out.println("Even");
       }
       else
       {
           System.out.println("Odd");
       }
       
    } 
} 

