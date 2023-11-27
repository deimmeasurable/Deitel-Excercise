package cohortAssignment;

import java.util.Stack;



public class MaxStack<T extends Comparable<T>> {
    private Stack<T> stackValue= new Stack<T>();
    private Stack<T> maxStack= new Stack<T>();
    private Stack<T> minStack= new Stack<T>();

    public void push(T obj){
        if(maxStack.isEmpty() || obj.compareTo(getMax())>0){
            maxStack.push(obj);

        }
        stackValue.push(obj);
    }
    public T pop(){
        if(stackValue.isEmpty()){
            return null;
        }
        T result= this.stackValue.pop();
        if (result ==getMax()){
            this.maxStack.pop();
        }
        return result;
    }
    public  T getMax(){
        if(maxStack.isEmpty()){
            return null;
        }
        return maxStack.peek();
    }
    public T getMin(){
        if(minStack.isEmpty()){
            return null;

        }
        return minStack.peek();
    }

    //

    public void pushs(T obj){
        if(maxStack.isEmpty() || obj.compareTo(getMax())>0 ){
            maxStack.push(obj);
        }
        stackValue.push(obj);
    }


}
