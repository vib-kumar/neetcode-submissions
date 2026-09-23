class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if ( s1.length() > s2.length() ){
            return false;
          }
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for(int i=0; i<s1.length();i++ ){
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i),0)+1);
            windowMap.put(s2.charAt(i),windowMap.getOrDefault(s2.charAt(i),0)+1);
        }
        if(windowMap.equals(s1Map)){
            return true;
        }
        int windowSize =s1.length();

        for(int i= windowSize; i <s2.length(); i++){
            //add new char
            char newChar = s2.charAt(i);
            windowMap.put(newChar,windowMap.getOrDefault(newChar,0)+1);

            //Remove old char on the left
             char oldChar = s2.charAt(i-windowSize);
            windowMap.put(oldChar,windowMap.getOrDefault(oldChar,0)-1);
            if(windowMap.get(oldChar)==0){
                windowMap.remove(oldChar);
            }

            if(windowMap.equals(s1Map)){
                return true;
            }
        }
        return false;
    }
}
