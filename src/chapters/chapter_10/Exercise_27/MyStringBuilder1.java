public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1 (String s){
        this.s=s;

    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
        String appendedString=this.s;
        appendedString+=s;
        return new MyStringBuilder1(appendedString);
    }
    public MyStringBuilder1 apend(int i){
        String appendedString=this.s;
        appendedString+=i;
        return new MyStringBuilder1(appendedString);
    }
    public int length(){
        return s.length();
    }
    public char charAt(int index){
        return s.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        String lowerCaseLetter="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                lowerCaseLetter+=(char)(s.charAt(i)+(97-65));
            }
            lowerCaseLetter+=s.charAt(i);
        }
        return new MyStringBuilder1(lowerCaseLetter);
    } 
    public MyStringBuilder1 substring(int begin, int end) {
        String substring = "";
        for (int i = begin; i < end; i ++) {
            substring += s.charAt(i);
        }
        return new MyStringBuilder1(substring);
    }
    public String toString(){
        return s;
    }
}

