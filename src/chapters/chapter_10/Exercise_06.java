// Displaying the prime numbers
public class Exercise_06 {

    public static void main(String[] args) {
        StackOfInteger2 stackOfInteger2 = new StackOfInteger2(50);
        final int LIMIT_OF_PRIME_NUMBER = 120;
        for (int i = 2; i <= LIMIT_OF_PRIME_NUMBER; i++) {
            if (isPrime(i)) {
                stackOfInteger2.push(i);

            }
        }
        for(int j=0;j< stackOfInteger2.getSize();j++){
            System.out.print(stackOfInteger2.getElements(j));
            if(j!=stackOfInteger2.getSize()-1){
                System.out.print(", ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

class StackOfInteger2 {
    private int [] elements;
    private int size;
    public static final int DEFAULT_CAPACITY=16;
    public StackOfInteger2(){
        this(DEFAULT_CAPACITY);

    }
    public StackOfInteger2(int capacity) {
        elements=new int[capacity];
    }
    public void push(int value){
        if(size>=elements.length){
            int []temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean empty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public int getElements(int i) {
        return elements[i];
    }
}

