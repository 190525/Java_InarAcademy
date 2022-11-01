public class Cp_25d {

    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
    }
}
class T1 {
    static int i = 0;
    int j = 0;
    T1() {
        i++;
        j = 1;
    }
}


