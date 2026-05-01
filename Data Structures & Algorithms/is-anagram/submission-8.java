class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() !=t.length()){
        return false;
      }
      int[]checkAnagram = new int[26];
      for(int i=0;i<s.length();i++){
        char value = Character.toLowerCase(s.charAt(i));
        checkAnagram[value-'a']++;
      }
        for(int i=0;i<t.length();i++){
            char value = Character.toLowerCase(t.charAt(i));
            checkAnagram[value-'a']--;
      }
      for(int i=0;i<checkAnagram.length;i++){
        if(checkAnagram[i]!=0)
            return false;
      }

      return true;

    }
}
