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
       
       if(n < 0)
       {
           System.out.println("Invalid Input");
           
           return;
       }
       
       System.out.println(n*(n+1)/2);
       
    } 
} 

