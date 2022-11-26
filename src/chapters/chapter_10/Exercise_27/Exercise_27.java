public class Exercise_27 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("İsmail");
        System.out.println(myStringBuilder1);

        System.out.println("After appending a new  \"MyStringBuilder1\": " + myStringBuilder1.append(new MyStringBuilder1(" Aslan")));

        System.out.println("After appending integer : " + myStringBuilder1.append(1905));

        System.out.println("Length of After appending: " + myStringBuilder1.length());

        System.out.println("5.index character: " + myStringBuilder1.charAt(5));

        System.out.println("Lower case letter: " + myStringBuilder1.toLowerCase());

        System.out.println("Substring of myStringBuilder1 from index 2 to 5: " + myStringBuilder1.substring(2, 5));

        System.out.println(myStringBuilder1.toString());
    }

}

