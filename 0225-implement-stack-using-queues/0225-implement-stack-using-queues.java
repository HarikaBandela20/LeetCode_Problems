class MyStack {
    Stack<Integer> s=new Stack<Integer>();
    public MyStack() {
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public boolean empty() {
        if(s.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */