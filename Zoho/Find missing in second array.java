class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> res =new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<m;i++)
        {
            set.add(b[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!set.contains(a[i]))
            res.add(a[i]);
        }
        return res;
    }
}
