class MinStack {
    Stack<Integer> minstack;
    Stack<Integer> Mainstack;

    public MinStack() {
        minstack=new Stack<>();
        Mainstack=new Stack<>();
    }

    
    public void push(int val) {
        Mainstack.push(val);

        if(minstack.isEmpty()){
            minstack.push(val);
        }
        else{
            minstack.push(Math.min(val,minstack.peek()));
        }
        
    }
    
    public void pop() {
        minstack.pop();
        Mainstack.pop();
        
    }
    
    public int top() {
       return  Mainstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */