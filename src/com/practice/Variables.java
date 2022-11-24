public class Variables {
    int a = 25; //Instance variables
    static int b = 23; // Static variables
    int c = a * b; //Instance variables

    boolean add() {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        Variables v = new Variables(); // object created
        System.out.println(b);

        v.a = 10;
        v.b = 29;

        Variables v1 = new Variables();
        System.out.println(v1.a); //instance variable cant change its value
        System.out.println(v1.b); //value get change of "b" with new object creation
        System.out.println(v1.add());
    }

}
