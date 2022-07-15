import java.math.*;
import java.io.*;
import java.util.*;


public class Unboxing
{ 
    public static void main(String[] args) 
    { 
       
        Character ch = 'a';

        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(24);

        int num = arrayList.get(0);

        System.out.println(num);     
    } 
} 

