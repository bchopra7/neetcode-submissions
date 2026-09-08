class MinStack {

    Stack<Integer> stk; 
    Stack<Integer> stkMin;
    public MinStack() {
        stk = new Stack<>();
        stkMin = new Stack<>();

    }
    
    public void push(int val) {
        if(stkMin.isEmpty() || val <= stkMin.peek())
            stkMin.push(val);
        stk.push(val);
    }
    
    public void pop() {
        if(stk.peek().equals(stkMin.peek()))
            stkMin.pop();
        stk.pop();
    }
    
    public int top() {
        return  stk.peek();
    }
    
    public int getMin() {
        return stkMin.peek();
    }
}
