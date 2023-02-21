# Lab-04---Assignment

## Task 01) Run the following code:

void countDown(int num)

 {

      if (num == 0) // test

                  System.out.println("Blastoff!");

       else {

                  System.out.println("...");

                    countDown(num-1); // recursive call

             } 

}


### what is the output of this code?

  It would keep printing "..." and a new line until it meets the if statement condition and then print "Blastoff!" with new line.

### - modify it so that it prints only the even numbers. 
  
  I modified the code in src file.
  Basically this....
  
  public static void countDown(int num){
        
        if (num == 0){ // test
            System.out.println("Blastoff!");
        }else if(num % 2 == 0){
            System.out.println(num+"...");
            
            countDown(num-2); // recursive call
        }else{
            countDown(num-1);
        } 
    }
  

### - what is the time complexity of this algorithm and why?

I think the time complexity is still linear so Big O(n) even with the modified changes. There is a constant iteration of n-2 until it reaches 0.


## Task 02) Run the following code:

int gcd(int x, int y) {

      if (x % y == 0) //base case

             return y;

       else

             return gcd(y, x % y);

}

### what is the output of this code?

  The output would just give the greatest common denominator between whatever the value of x and the value of y. So if x was 5 and y was 10 the output would be 5.

### - modify it to find the gcd using subtraction instead of %.

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
    
## Task 03) Run the following code:


int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return fib(n – 1) + fib(n – 2);

}

### what is the time complexity of this algorithm and why?

The time complexity is 0(2^n). Its exponential because of its recursive tree. With each level it call 2^ n calls in that level.

# Homework

## please submit the solution to the following problems:

Note: All code is in src files

### Write a function that prints "Hello World" n times recursively.

public static void hello(int n){
        if(n == 0){
            System.out.println("Done");
        }else{
            System.out.println("Hello World");
            hello(n-1);
        }
    }


### Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.

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
   
   I assume that the input for n1 is less than n2 which is how i made this algorithm.
       

### Write a function that implements the binary search algorithm recursively.

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
            
        }
        
    }
    
    I also used the Arrays.sort() method in main method just in case if im dealing with unsorted arrays

