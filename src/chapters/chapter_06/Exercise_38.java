public class Exercise_38 {
    //Generate random characters
    public static void main(String[] args) {

        getRandomUpperCaseLetter();
        System.out.println("-----------------------------");
        getRandomDigit();


    }
    public static int randomUpperCaseLetter(){ //Generate random upper case letter characters
        int asciiCode=(int)('A'+(int)(Math.random()*('Z'-'A')));
        return asciiCode;
    }
    public static int randomDigit(){ //Generate random single digit characters
        int asciiCode=(int)((Math.random()*10));
        return asciiCode;
    }
    public static void getRandomUpperCaseLetter(){//print 1000 pcs generating random upper case letter characters
        final int NUMBER_OF_UPPERCASE_LETTER=100;
        int count=0;
        for(int i=0;i<NUMBER_OF_UPPERCASE_LETTER;i++){
            char ch=(char)randomUpperCaseLetter();
            System.out.print(ch+" ");
            count++;
            if(count%10==0){
                System.out.println();
            }

        }

    }public static void getRandomDigit(){// 1000 pcs print generating random single digit characters
        final int NUMBER_OF_SINGLE_DIGIT=100;
        int count=0;
        for(int i=0;i<NUMBER_OF_SINGLE_DIGIT;i++){

            System.out.print( randomDigit()+" ");
            count++;
            if(count%10==0){
                System.out.println();
            }

        }

    }

}

