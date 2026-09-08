class MinStack {
    Stack<Integer> minStk;
    Stack<Integer> stk;

    public MinStack() {
        stk = new Stack<>();
        minStk = new Stack<>();              
    }
    
    public void push(int val) {
       stk.push(val);

       if(minStk.isEmpty() || val <= minStk.peek()){
            minStk.push(val);
       }
    }
    
    public void pop() {
        int val = stk.pop();

        if(!minStk.isEmpty() && minStk.peek() == val){
            minStk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}
