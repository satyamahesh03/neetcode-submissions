class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        for(char ch : ch1){
            list.add(ch);
        }

        for(char ch: ch2){
            if(list.contains(ch)) list.remove(Character.valueOf(ch));
            else return false;
        }

        return true;
    }
}
