class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
