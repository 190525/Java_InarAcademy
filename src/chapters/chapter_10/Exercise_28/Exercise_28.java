public class Exercise_28 {
    public static void main(String[] args) {

        char[] chars = {'I', 's', 'm', 'a', 'i', 'l'};
        MyStringBuilder2 builder2 = new MyStringBuilder2(chars);
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("Aslan");
        System.out.println("builder2:"+builder2.toString());
        System.out.println("myStringBuilder2: "+myStringBuilder2.toString());

        System.out.println("\nAfter inserting  at index 3: "+myStringBuilder2.insert(3, builder2));

        System.out.println("After reversing: " + myStringBuilder2.reverse());

        System.out.println("Substring of builder2 beginning index 3: " + builder2.substring(3));

        System.out.println("myStringBuilder2 with uppercase letter: " + myStringBuilder2.toUpperCase());
    }
}


