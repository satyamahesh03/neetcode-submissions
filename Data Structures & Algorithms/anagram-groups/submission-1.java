class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String sortedArray = new String(chrs);

            map.putIfAbsent(sortedArray, new ArrayList<>());
            map.get(sortedArray).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
