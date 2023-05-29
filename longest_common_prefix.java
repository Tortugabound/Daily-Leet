import java.util.Arrays;

//Problem:14.Longest Common Prefix
//Name:Sumit Patil
//Runtime:78.29
//Memory:81.40



class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0; i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!= last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
