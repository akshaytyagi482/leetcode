class MyStack {

    Queue<Integer> s1 = new LinkedList<>();
    
    public void push(int x) {
         int size = s1.size();
        s1.add(x);
        for(int i=0;i<size;i++){
            s1.add(s1.peek());
            s1.poll();
        }
    }
    
    public int pop() {
        int temp=s1.peek();
        s1.poll();
        return temp;  
    }
    
    public int top() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
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