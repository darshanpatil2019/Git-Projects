public class A {
    static int a = 20;

    public void add(){
        System.out.println(a);
    }

    static void add1(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        A a = new A();
        a.add();
        A.add1();
    }
}
