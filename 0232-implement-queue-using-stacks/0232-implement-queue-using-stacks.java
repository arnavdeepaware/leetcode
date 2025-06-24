class MyQueue {

    Stack<Integer> st;
    Stack<Integer> rSt;

    public MyQueue() {
        st  = new Stack<>();
        rSt = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(rSt.isEmpty()){
            while(!st.isEmpty()){
                rSt.push(st.pop());
            }
        }

        return rSt.pop();
    }
    
    public int peek() {
        if(rSt.isEmpty()){
            while(!st.isEmpty()){
                rSt.push(st.pop());
            }
        }

        return rSt.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && rSt.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */