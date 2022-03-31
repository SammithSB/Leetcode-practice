class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        if(x%10==0){
            return false;
        }
        int rever = 0;
        while(x>rever){
            int pop = x%10;
            x/=10;
            rever = (rever*10)+pop;
        }
        if(x == rever || x == rever/10){
            return true;
        }
        return false;
    }
}