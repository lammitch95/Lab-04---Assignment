

package com.mycompany.lab04_assignment;

import java.util.*;

/**
 *
 * @author lammi
 */
public class Lab04_Assignment {
    
    public static void countDown(int num){
        //modified code to print event numbers
        if (num == 0){ // test
            System.out.println("Blastoff!");
        }else if(num % 2 == 0){
            System.out.println(num+"...");
            
            countDown(num-2); 
        }else{
            countDown(num-1);
        } 
    }
    
    public static void gcd(int x, int y) {
      //modified gcd method using subtraction
      if(x == y){
           System.out.println("GCD: " + x);    
      }else if(x > y){
           x = x-y;
           gcd(x,y);
       }else{
          y = y-x;
          gcd(x,y);
      }

    }
    
    public static void hello(int n){
        //prints Hello World n times
        if(n == 0){
            System.out.println("Done");
        }else{
            System.out.println("Hello World");
            hello(n-1);
        }
    }
    
    public static int sumNums(int n1, int n2){
      //sum of numbers that are mutliples of 7
       if(n1 > n2){
        
           return 0;
        
       }else if (n1 % 7 == 0){
            
            return n1 + sumNums(n1 + 7, n2);
       
       }else{
           
            return sumNums(n1 + 1, n2);
       }
             
   }
    
    public static void binarySearch(int[] arr,int left,int right, int target){
        
        int middle = (left+right)/2;
        if(left < right){
            if(arr[middle] > target){
                binarySearch(arr,left,middle-1,target);
            
            }else{
            
                binarySearch(arr,middle+1,right,target);
            }
        
        }else{
            
            if(arr[middle] == target){
                
                System.out.println("HOORAY, TARGET HAS BEEN FOUND");
                
            }else{
                
                System.out.println("TARGET DOES NOT EXIST");
            }
            //
        }
        
    }

    public static void main(String[] args) {
        
        //countDown(10);
        //gcd(770,900);
        //hello(5);
        //System.out.println("Sum with numbers multiple of SEVEN: " + sumNums(1,50));
        int[] nums = {2,9,15,23,4,8,54,3};
        Arrays.sort(nums);
        int numSearch = 54;
        binarySearch(nums,0,nums.length-1,numSearch);
    }
}
