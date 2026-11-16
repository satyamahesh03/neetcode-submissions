class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        int[] res = new int[k];
        list.sort((a,b)->map.get(b)-map.get(a));

        for(int i=0; i<k; i++){
            res[i] = list.get(i);
        }

        return res;
    }
}
