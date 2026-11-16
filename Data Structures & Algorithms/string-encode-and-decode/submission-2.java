class Solution {

    public String encode(List<String> strs) {
        StringBuilder strRes = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for(String str : strs){
            sizes.add(str.length());
        }

        for(int size : sizes){
            strRes.append(size).append(',');
        }
        strRes.append('#');
        for(String str : strs){
            strRes.append(str);
        }

        return strRes.toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();

        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder stringSize = new StringBuilder();
            while(str.charAt(i)!=','){
                stringSize.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(stringSize.toString()));
            i++;
        }

        i++;
        for(int size : sizes){
            res.add(str.substring(i, i+size));
            i+=size;
        }

        return res;
    }
}
