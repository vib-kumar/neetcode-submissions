class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length()==0){
            return false;
        }
        String modified = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = modified.length();

    for(int i = 0 ; i < modified.length()-1/2; i++){
        if(modified.charAt(i)!= modified.charAt(len-i-1)){
            return false;
        }
    }
        return true;
    }
}
