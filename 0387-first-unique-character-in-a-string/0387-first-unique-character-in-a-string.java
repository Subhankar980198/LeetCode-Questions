import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
      int n=s.length();
      HashMap<Character,Integer> h=new HashMap<>();
      for(int i=0;i<n;i++)  {
        char ch=s.charAt(i);
        h.put(ch,h.getOrDefault(ch,0)+1);}
        for(int i=0;i<n;i++ ){
            if(h.get(s.charAt(i))==1){
                return i;
            }
            }
                  return -1;

    }
}