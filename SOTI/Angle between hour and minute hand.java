class Solution {
    static int getAngle(int H , int M) {
        // code here
        double ans = Math.abs(30*H-(double)11/2*M);
        if(ans>180)
        {
            ans=360-ans;
        }
        return (int)ans;
    }
};
