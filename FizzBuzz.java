/* Print to print within the range of 1 to 100 when a multiple of 3 appears print "Fizz" in place of number,
when a multiple of 5 appears print "Buzz" in place of number and when multiple of 3 and 5 appears print "FizzBuzz" in 
place of number.*/

import java.util.*; 
class fizzbuzz 
{ 
    public static void main(String args[]) 
    {  
        int n = 100; 
  
        // loop for 100 times 
        for (int i=1; i<=n; i++)                                  
        { 
            if (i%15==0)                                                  
                System.out.print("FizzBuzz"+" ");  
            /* number divisible by 5, print 'Buzz'  
             in place of the number */
            else if (i%5==0)      
                System.out.print("Buzz"+" ");  
  
            /* number divisible by 3, print 'Fizz'  
            in place of the number */
            else if (i%3==0)      
                System.out.print("Fizz"+" ");  
  
            /* number divisible by 15(divisible by 
             both 3 & 5), print 'FizzBuzz' in  
             place of the number */
                  
            else // print the numbers 
                System.out.print(i+" ");                          
        } 
    } 
} 