package cohortAssignment;

import java.util.Stack;




public class MaximumStack extends Stack<Integer>{
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int value){
        if(value <=min()){
            minStack.push(value);
        }
        if (value >=max()){
            maxStack.push(value);
        }
        super.push(value);
    }
    public Integer pop() {
        int value = super.pop();
        if(value==min()){
            minStack.pop();
        }
        if(value==max()){
            maxStack.pop();
        }
        return value;
    }
    public int max() {
        if(maxStack.empty()){
            return  Integer.MIN_VALUE;

        }else {
            return maxStack.peek();
        }
    }
    public int min() {
        if(minStack.empty()){
            return Integer.MAX_VALUE;
        }else {
            return minStack.peek();
        }
    }

}
