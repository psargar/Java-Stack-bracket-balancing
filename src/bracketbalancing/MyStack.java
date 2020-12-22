
package bracketbalancing;

public class MyStack {
    int capacity,top=-1;
    char a[];
    
    
    MyStack(int l){
        a = new char[l];
        capacity=l;
        
    }
    boolean isEmpty(){
        if(top == -1)    
            return true;
        else
            return false;
        
    }
    
    boolean isFull()
    {
        if(top == capacity-1)
            return true;
        else
            return false;
    }
    
    void push(char x){
        a[++top]=x;
    }
    
    void pop(){
        top = top-1;
    }
         
    char peek(){
        if(!isEmpty())
        return a[top];
        else return 0;
    }
}
