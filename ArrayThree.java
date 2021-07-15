// this program is to display the elements of the array
import java.util.*;
import java.io.*;
class ArrayThree
{
// function in java is called a method since it is included inside a class
// declare a static function with two parameters inside the function
  public static int rde(int ar1[],int var1)
   {
      //check the condition for the value of n to either return 0 or 1
       if(var1==0 || var1==1)
       {

             System.out.println(var1);
             return var1;
       }
    
  // swap the values using a count with an empty array element
       int[] count= new int[var1];
       int cnt=0;
       //loop through the values with a if condition
       for(int i=0;i<var1-1;i++)
       {
             if(ar1[i] != ar1[i+1]) {
                 // System.out.println(ar1[0]);
                 // System.out.println(ar1[1]);
               count[cnt++]=ar1[i];
              }
        }
           count[cnt++]=ar1[var1-1];
       // changing the orginal array
          for(int i=0;i<cnt;i++){
                ar1[i]=count[i];
       }
          return cnt;
     }

public static void main(String args[]) 
{
      int ar1[] = {20,30,45,46,46,47};
      int length=ar1.length;
      length=rde(ar1,length);
      // print array elements
      for(int i=0;i<length;i++)
      {
          System.out.println(ar1[i]+" ");
      } 
}
} 
                 