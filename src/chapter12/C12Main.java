package chapter12;

public class C12Main {
    public static void main(String[] args) {
        Y a = new A();
        Y b = new B();

        Y[] y = new Y[2];
        y[0] = new A();
        y[1] = new B();

        for (Y ys : y) {
            ys.b();
        }
    }
}
