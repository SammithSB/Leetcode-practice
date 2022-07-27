class Solution {
    public int maxLength(List<String> arr) {
        return helper(arr, 0,"");
    }
    public int helper(List<String> arr, int curr, String str){
        if(curr>=arr.size()){
            return str.length();
        }
        int recurr =0;
        int recurr2=0;
        String s = str+arr.get(curr);
        if(isUniq(s)){
            recurr = helper(arr, curr+1,str+arr.get(curr));
        }
        recurr2 = helper(arr, curr+1,str);
        return Math.max(recurr, recurr2);
    }
    public boolean isUniq(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int j=0;j<26;j++){
            if(arr[j]>1){
                return false;
            }
        }
        return true;
    }
}