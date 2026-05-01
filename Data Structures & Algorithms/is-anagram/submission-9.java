class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() !=t.length()){
        return false;
      }
      s=s.toLowerCase();
      t=t.toLowerCase();
      int[]checkAnagram = new int[26];
      for(int i=0;i<s.length();i++){
        checkAnagram[s.charAt(i)-'a']++;
        checkAnagram[t.charAt(i)-'a']--;
      }
      for(int i=0;i<checkAnagram.length;i++){
        if(checkAnagram[i]!=0)
            return false;
      }
      return true;
    }
}
