public class Main {



    /*Que 1. Write a recursive function printIncreasing() that
prints numbers from 1 to n in increasing order.
Example
Input: 5
Output: 1 2 3 4 5 */
public static void Printincreasing(int n)
{
    if(n==0) return;
    Printincreasing(n-1);
    System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        Printincreasing(n);
    }
}
