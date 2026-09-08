class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int result[] = new int[n];

        Stack<Integer> stk =new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && temperatures[i] >= temperatures[stk.peek()]){
                stk.pop();
            }

            if(!stk.isEmpty()) {
                result[i] = stk.peek() - i;
            }

            stk.push(i);
        }
        return result;
    }
}
