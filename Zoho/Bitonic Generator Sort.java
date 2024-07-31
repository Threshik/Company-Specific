class Solution
{
    void bitonicGenerator(long arr[], int n)
    {
        ArrayList<Long> l1 = new ArrayList<>();
        ArrayList<Long> l2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            l1.add(arr[i]);
            else
            l2.add(arr[i]);
        }
        Collections.sort(l1);
        Collections.sort(l2,Collections.reverseOrder());
        int k=0;
        for(long i:l1)
        arr[k++]=i;
        for(long i:l2)
        arr[k++]=i;
    }
}
