class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
        Set<Integer> set = new HashSet<>();
          for(int n : nums){
            while(n > 0){
                int rem = n % 10;  // get last digit
                set.add(rem);
                n = n / 10;
            }
          }
        
        int[] arr = new int[set.size()];
        int i=0;
        for(int c:set)
        {
            arr[i++]=c;
        }
        return arr;
        
    }
}
