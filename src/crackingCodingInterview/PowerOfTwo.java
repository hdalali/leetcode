package crackingCodingInterview;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        if(n<=0) return false; 
        int temp=n-1;
        int ans=n&temp;
        if(ans==0) return true;
        else
        return false;
    }
}
