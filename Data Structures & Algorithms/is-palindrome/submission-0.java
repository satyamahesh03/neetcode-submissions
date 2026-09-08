class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        char[] chars = s.toCharArray();

        for(char ch : chars){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
