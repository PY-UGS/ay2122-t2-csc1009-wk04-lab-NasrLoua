package lab4Q2;

public class StackOfIntegers {

    private int elements[];
    private int size;


    public StackOfIntegers() {
        this.size = -1;
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.size = -1;
        this.elements = new int[capacity];
    
    }
    
    public boolean empty() {
        if (this.size == -1)
            return true;
        else    
            return false;

    }

    public int peek() {
        return this.elements[this.size]; 
    }

    public void push(int value) {
        this.size++;
        this.elements[this.size] = value;
        
    }

    public int pop() {
        int temp = this.elements[this.size];
        this.elements[this.size] = 0;
        this.size--;
        return temp;
    }

    public int getSize() {
        return this.size;
    }

}
