package chapter_13.Exercise_08;

public class Exercise_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack myStack=new MyStack();
        myStack.push("ismail");
        myStack.push("Aslan");
        myStack.push(1995);
        MyStack clonedMyStack=(MyStack)myStack.clone();
        clonedMyStack.pop();
        clonedMyStack.push("Galatasaray");
        System.out.println(myStack.toString());
        System.out.println(clonedMyStack.toString());

    }
}

