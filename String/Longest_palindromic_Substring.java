class Solution {
    // public String longestPalindrome(String s) {
    //      int n = s.length();
    //     if(s == null || n<1){
    //         return "";
    //     }
       
    //     String longest = "";
    //     for(int i = 0;i<n;i++){
    //         for(int j = i ;j< n;j++){
    //             if(ispalindrome(s,i,j) && (j-i+1)>longest.length()){
    //                 longest = s.substring(i,j+1);
    //             }
    //         }
    //     }
    //     return longest;
    // }
    // boolean ispalindrome(String s,int start,int end){
    //     while(start<end){
    //         if(s.charAt(start) != s.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
    static boolean ispalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String a = "babad";
        int n = a.length();
        String longest = "";
        for(int i = 0;i<n;i++){
            for(int j =i;j<n;j++){
                if(ispalindrome(a, i, j)&& (j-i+1)> longest.length()){
                    longest = a.substring(i,j+1);
                }
            }
        }
        System.out.println("the largest substring is: "+longest);
    }
}