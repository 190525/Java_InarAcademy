public class MyStringBuilder2 {
    private String s="";

    public MyStringBuilder2(char[] chars) {
        // s = String.valueOf(chars);
        for(int i=0;i<chars.length;i++){
            s+=chars[i];
        }
    }
    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String insert = "";
        int i;
        for (i = 0; i < offset; i++) {
            if (i < offset)
                insert += this.s.charAt(i);
        }
        insert += s;
        return new MyStringBuilder2(insert + substring(offset));
    }

    public MyStringBuilder2 reverse() {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return new MyStringBuilder2(reverse);
    }

    public MyStringBuilder2 substring(int begin) {
        String substring = "";
        for (int i = begin; i < s.length(); i++) {
            substring += s.charAt(i);
        }
        return new MyStringBuilder2(substring);
    }
    public MyStringBuilder2 toUpperCase() {
        String upperCaseLetter = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                upperCaseLetter += (char)(s.charAt(i) - (97-65));
            else
                upperCaseLetter += s.charAt(i);
        }
        return new MyStringBuilder2(upperCaseLetter);
    }

    public String toString() {
        return s;
    }

}

