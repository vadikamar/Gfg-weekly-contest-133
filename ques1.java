class Solution {
    public static long totalWays(int N) {
        // code here
        long f=1;
        for(int i=1;i<=N;i++) f*=i;
        return f;
    }
}
