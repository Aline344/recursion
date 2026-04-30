public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Print Increasing:");
        Printincreasing(n);
        System.out.println("\nPrint Decreasing:");
        PrintDecreasing(n);
        System.out.println("\nIncreasing Decreasing:");
        IncreasingDecreasing(n);
        System.out.println("\nFind Sum:");
        System.out.println(findSum(n));
        int n1 = 3, n2 = 7;
        System.out.println("\nFind Range Sum:");
        System.out.println(findRangeSum(n1, n2));
        System.out.println("\nFactorial:");
        System.out.println(factorial(n));
        int number = 2, pow = 3;
        System.out.println("\nPower:");
        System.out.println(power(number, pow));
        int num = 1789;
        System.out.println("\nCount Digits:");
        System.out.println(count(num));
        System.out.println();
        int[] list1 = { 2, 4, 3 };
        int[] list2 = { 5, 6, 4 };
        ListNode l1 = new ListNode(list1[0]);
        ListNode l2 = new ListNode(list2[0]);
        ListNode current1 = l1;
        ListNode current2 = l2;
        for (int i = 1; i < list1.length; i++) {
            current1.next = new ListNode(list1[i]);
            current1 = current1.next;
        }
        for (int i = 1; i < list2.length; i++) {
            current2.next = new ListNode(list2[i]);
            current2 = current2.next;
        }
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println("\nAdd Two Numbers:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        String s = "aa";
        String p = "a";
        System.out.println("\nRegular Expression Matching:");
        System.out.println(isMatch(s, p));
        System.out.println();
        s = "aa";
        p = "*";
        System.out.println("\nWildcard Pattern Matching:");
        System.out.println(Solution.isWildcardMatch(s, p));
        
        System.out.println("reverse k group :");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        Main main = new Main();
        ListNode reversedHead = main.reverseKGroup(head, k);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
        System.out.println();

        System.out.println("swap pairs :");
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        main = new Main();
        ListNode swappedHead = main.swapPairs(head);
        while (swappedHead != null) {
            System.out.print(swappedHead.val + " ");
            swappedHead = swappedHead.next;
        }
        System.out.println();
    System.out.println("mergeTwoLists");
        ListNode list12 = new ListNode(1);
        list12.next = new ListNode(2);
        list12.next.next = new ListNode(4);

        ListNode list52 = new ListNode(1);
        list52.next = new ListNode(3);
        list52.next.next = new ListNode(4);

        ListNode mergedHead = mergeTwoLists(list12, list52);
        while (mergedHead != null) {
            System.out.print(mergedHead.val + " ");
            mergedHead = mergedHead.next;
        }
        System.out.println();



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
     *
     */
    public static int findRangeSum(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }

        return n1 + findRangeSum(n1 + 1, n2);
    }

    /*
     * Que 6. Write a recursive function factorial() that
     * calculates and returns the factorial of a given integer
     * number.
     * Note : 0! = 1 and 1! = 1
     * Example
     * Input: 5! = 1 * 2 * 3 * 4 * 5 = 120
     * 5! = 1 * 2 * 3 * 4 * 5 = 120
     * Output: 120
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    /*
     * Que 7. Write a recursive function power() that
     * calculates and returns the result of number raised to
     * the given power.
     * Example
     * Input : 2 3
     * Output : 8
     */
    public static int power(int number, int pow) {
        if (pow == 0)
            return 1;
        return number * power(number, pow - 1);

    }

    /*
     * Que 8. Write a recursive function count() to count
     * the number of digits in a given positive integer.
     * Example
     * Input : 1789
     * Output : 4
     */
    public static int count(int n) {
        if (n == 0)
            return 0;
        return 1 + count(n / 10);
    }

    /*
     * 9.You are given two non-empty linked lists representing
     * two non-negative integers. The digits are stored in reverse order,
     * and each of their nodes contains a single digit. Add the two numbers
     * and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero,
     * except the number 0 itself.
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    /*
     * Given an input string s and a pattern p, implement regular expression
     * matching with support for '.' and '*' where:
     * 
     * '.' Matches any single character.​​​​
     * '*' Matches zero or more of the preceding element.
     * Return a boolean indicating whether the matching covers the entire input
     * string (not partial).
     */
    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        boolean firstMatch = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    /*
     * 
     * 
     * 
     * 
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists into one sorted list. The list should be made by splicing
     * together
     * the nodes of the first two lists.
     * 
     * Return the head of the merged linked list.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode shashank = new ListNode(0);
        ListNode current = shashank;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return shashank.next;
    }

    /*
     * Given a linked list,
     * swap every two adjacent nodes and return its head.
     * You must solve the problem without modifying the values in the list's
     * nodes (i.e., only nodes themselves may be changed.)
     * Example 1:
     * Input: head = [1,2,3,4]
     * Output: [2,1,4,3]
     * Explanation:
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;

    }

    /*
     * Given the head of a linked list, reverse the nodes of the list k at a time,
     * and return the modified list.
     * k is a positive integer and is less than or equal to the length of the linked
     * list.
     * If the number of nodes is not a multiple of k then left-out nodes, in the
     * end, should remain as it is.
     * You may not alter the values in the list's nodes, only nodes themselves may
     * be changed.
     * 
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode groupStart = prevGroupEnd.next;
            ListNode groupEnd = prevGroupEnd;

            for (int i = 0; i < k && groupEnd != null; i++) {
                groupEnd = groupEnd.next;
            }

            if (groupEnd == null) {
                break;
            }

            ListNode nextGroupStart = groupEnd.next;
            reverse(groupStart, groupEnd);
            prevGroupEnd.next = groupEnd;
            groupStart.next = nextGroupStart;
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    private void reverse(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode current = start;

        while (prev != end) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
    }

    /*
     * Given an input string (s) and a pattern (p), implement wildcard pattern
     * matching with
     * support for '?' and '*' where:
     * '?' Matches any single character.
     * '*' Matches any sequence of characters (including the empty sequence).
     * The matching should cover the entire input string (not partial).
     * Input: s = "aa", p = "a"
     * Output: false
     * Explanation: "a" does not match the entire string "aa".
     */
}

class Solution {
    public static boolean isWildcardMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        boolean firstMatch = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '?'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isWildcardMatch(s, p.substring(2)) ||
                    (firstMatch && isWildcardMatch(s.substring(1), p)));
        } else {
            return firstMatch && isWildcardMatch(s.substring(1), p.substring(1));
        }
    }
}
