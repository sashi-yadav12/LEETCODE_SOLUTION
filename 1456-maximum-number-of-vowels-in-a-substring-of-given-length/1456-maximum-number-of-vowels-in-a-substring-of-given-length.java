class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count =0 ;
        int maxcount = 0;
        for(int right = 0;right< s.length();right++){
            char ch = s.charAt(right);
            if(isvowel(ch)){
                count++;
            }
            if(right-left+1 > k){
                if(isvowel(s.charAt(left))){
                    count--;
                }
                left++;
                
            }
            if(right-left+1 ==k){
                maxcount = Math.max(maxcount,count);
            }
        }
        return maxcount;
        
    }
    public static Boolean isvowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
}