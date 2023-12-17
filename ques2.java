class Solution{
    
    int minOperations(int a[], int N) 
    { 
        // Code here
        int m=Integer.MIN_VALUE;
        for(int i:a) m=Math.max(i,m);
        int c=0;
        for(int i:a)
        {
            if(i==m) c++;
        }
        if(c==1) return 0;
        int d=1,f=Integer.MIN_VALUE;
        for(int i=0;i<N-1;i++)
        {
            if(a[i]==m)
            {
                if(a[i+1]==m)
                d++;
                else
                f=Math.max(d,f);
            }
            else
            d=1;
        }
        f=Math.max(d,f);
        return c-f;
    } 
}
