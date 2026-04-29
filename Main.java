public class Main {

    public static void main(String[] args) {
        System.out.println("question 1");
        int n = 5;
        Printincreasing(n);
        System.out.println();
        System.out.println("question 2");
        int m = 5;
        PrintDecreasing(m);
        System.out.println();
        System.out.println("question 3");
        int p = 3;
        IncreasingDecreasing(p);
        System.out.println();
        System.out.println("question 4");
        int q = 5;
        int sum = findSum(q);
        System.out.println("1+2+3+4+5 = " + sum);
        System.out.println("question 5");
        int n1 = 3;
        int n2 = 7;
        System.out.print("3+4+5+6+7 =  ");
        System.out.println(findRangeSum(n1, n2));
    }

    /*
     * Que 1. Write a recursive function printIncreasing() that
     * prints numbers from 1 to n in increasing order.
     * Example
     * Input: 5
     * Output: 1 2 3 4 5
     */
    public static void Printincreasing(int n) {
        if (n == 0)
            return;
        Printincreasing(n - 1);
        System.out.print(n + " ");
    }

    /*
     * Que 2. Write a recursive function printDecreasing()
     * that prints numbers from n to 1 in decreasing order.
     * Example
     * Input: 5
     * Output: 5 4 3 2 1
     */
    public static void PrintDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PrintDecreasing(n - 1);
    }

    /*
     * Que 3. Write a recursive function IncreasingDecreasing()
     * that prints numbers from 1 to n in increasing order and
     * then from n to 1 in decreasing order.
     * Example
     * Input: 3
     * Output: 1 2 3 3 2 1
     */
    public static void q1(int n) {
        if (n == 0)
            return;
        Printincreasing(n - 1);
        System.out.print(n + " ");

    }

    public static void q2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PrintDecreasing(n - 1);
    }

    public static void IncreasingDecreasing(int n) {
        q1(n);
        q2(n);
    }

    /*
     * Que 4. Write a recursive function findSum() that
     * calculates and returns the sum of the first n natural
     * numbers.
     * Example
     * Input: 5
     * Output: 1+2+3+4+5 = 15
     */
    public static int findSum(int n) {
        if (n == 0)
            return 0;
        return n + findSum(n - 1);

    }

    /*
     * Que 5. Write a recursive function findRangeSum() that
     * calculates and returns the sum of all integers between
     * number1 and number2 (inclusive).
     * Example
     * Input: number 1 = 3 , number 2 = 7
     * Output: 3+4+5+6+7 = 25
     */
    /**
     * @param n1
     * @param n2
     */
    public static int findRangeSum(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }
        
        return n1 + findRangeSum(n1 + 1, n2);
    }
}
