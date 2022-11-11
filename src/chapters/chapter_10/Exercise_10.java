public class Exercise_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        // inserting 20 numbers into queue
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i+1);
        }
        for(int i=0;i< queue.getSize();i++){
            System.out.print(queue.getElements(i)+" ");
        }
        System.out.println();
        //A loop is created to show the correctness of the first-in first-out fashion in the queue.
        for(int i=0;i<5;i++){
            queue.dequeue();
        }
        for(int i=0;i< queue.getSize();i++){
            System.out.print(queue.getElements(i)+" ");
        }
    }
}
class Queue{

    private int [] elements;
    private int size;
    public static final int DEFAULT_CAPACITY=8;
    public Queue(){
        this(DEFAULT_CAPACITY);

    }
    public Queue(int capacity) {
        elements=new int[capacity];
    }
    public void enqueue(int v){
        if(size>=elements.length){
            int []temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=v;
    }
    public void dequeue(){
        for(int i=0;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        size--;
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

