
package Array;/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
public static void main (String[] args) {

String str="Class abc{ public static void main(String[]args){if(k>0){System.out.print(123);}}";
   String space="     ";
   String stringInput="";
   int count=0;
 for(int i=0;i<str.length();i++)
 {
     if(str.charAt(i)!='}')
     stringInput+=str.charAt(i);
     
     if(str.charAt(i)=='{'){
         count++;
         int k=count;
         stringInput+="\n";
         while(k-->0)
         stringInput+=space;
         
     }
     
     else if(str.charAt(i)=='}')
     {
         int k=count;
         stringInput+="\n";
         while(k-->0){
        stringInput+=space;
         k--;
         }
          stringInput+="}";
         count--;
     }
     
     else if(str.charAt(i)==';')
     stringInput+="\n"+space;
 }
 
 for(int i=0;i<stringInput.length();i++)
 System.out.print(stringInput.charAt(i));
}
}

