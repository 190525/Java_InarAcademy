public class Cp_25a {
    public static void main(String[] args) {
        int []a={1,2};
        swap(a[0],a[1]);
        System.out.println("a[0]="+a[0]+" a[1]="+a[1]);
    }

    public static void swap(int i, int i1) {
        int temp=i;
        i=i1;
        i1=temp;
    }
}
}
