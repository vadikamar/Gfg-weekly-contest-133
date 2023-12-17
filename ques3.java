class Solution {
    public static int maxHappy(int n, int[] bags, int m, int[] requirement) {
        // code here
        Arrays.sort(bags);
        Arrays.sort(requirement);
        int ms=0,bi=0;
        for(int i:requirement)
        {
            while(bi<bags.length && bags[bi]<i)
            {
                bi++;
            }
            if(bi<bags.length)
            {
                ms++;
                bi++;
            }
            else
            break;
        }
        return ms;
    }
}
