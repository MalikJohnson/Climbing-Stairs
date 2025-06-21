class Solution {
    public int climbStairs(int n) {
        // Recursion and Fibonacci
        if(n<=2) return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}