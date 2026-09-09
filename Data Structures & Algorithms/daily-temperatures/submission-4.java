class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int N = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[N];

        for(int temp = 0; temp<N; temp++){
            int count = 0;
            for(int tempNext = temp+1; tempNext<N; tempNext++){
                count++;
                if(temperatures[tempNext]>temperatures[temp]){
                    result[temp] = tempNext-temp;
                    break;
                }
                if(tempNext==N-1){
                    result[temp] = 0;
                }
            }
        }

        return result;
    }
}
