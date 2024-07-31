class Solution {
    public static String encode(String s) {
        // code here
        if(s==null || s.isEmpty())
        return "";
        int count=1;
        int n = s.length();
        StringBuffer str = new StringBuffer();
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                str.append(s.charAt(i-1)).append(count);
                count=1;
            }
            else
            count++;
        }
        str.append(s.charAt(n-1)).append(count);
        return str.toString();
    }
}
