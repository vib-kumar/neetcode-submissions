class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString = new StringBuilder();
        for (String s: strs){  
            encodeString.append(s.length())
                        .append('#')
                        .append(s);
        }
        return encodeString.toString();
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j=i;
            while (str.charAt(j)!='#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+1+len);
            decode.add(s);
            i= j+1+len;
        }
     return decode;
    }
}
