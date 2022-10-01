package chapter_07;

public class Cp_8 {
    public static void main(String[] args) {
    //Create an array to hold 10 double values.
    double[]myList=new double[10];

    // Assign the value 5.5 to the last element in the array
    myList[9]=5.5;

    //Display the sum of the first two elements.
    System.out.println("the sum of the first two elements is"+myList[0]+myList[1]);

    // Write a loop that computes the sum of all elements in the array.
    double sum=0;
    for(int i=0;i<myList.length;i++){
        sum+=myList[i];
    }
    //Write a loop that finds the minimum element in the array.
    double max=-1;
    for(int i=0;i<myList.length;i++){
        if(myList[i]>max){
            max=myList[i];
        }
    }
    // Randomly generate an index and display the element of this index in the array.
        int index=(int)(Math.random()*myList.length);
        System.out.println(myList[index]);
    //Use an array initializer to create another array with the initial values 3.5, 5.5,4.52, and 5.6.
        double[]newArray={3.5,5.5,4.52,5.6};

    }

}

