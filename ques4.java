class Solution
{
    int min_lights(int hallway[], int n)
    {
        // Write your code here
     for(int i=0;i<n;i++)
     {
         if(hallway[i]==-1) continue;
         int l=Math.max(0,i-hallway[i]);
         int r=i+hallway[i]+1;
         hallway[l]=Math.max(hallway[l],r);
     }
     int re=hallway[0],c=0,j=0;
     for(int i=0;i<n && j<n && i<=j;i++)
     {
         re=Math.max(re,hallway[i]);
         if(i==j)
         {
             if(re<=i) return -1;
             c++;
             j=re;
         }
     }
     return c;
    }
