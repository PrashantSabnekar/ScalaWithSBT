package access;

public class Data {

    private String name;

    public Data(String name) {
        this.name = name;
    }

    private void f1() {
        System.out.println("This is a private method. Name = " + name);
    }

    public void f2(Data d) {
        f1();
        d.f1();
    }
    public static void main(String args[]) {

        Data d1 = new Data("One");
        Data d2 = new Data("Two");

        d1.f2(d2);
        d1.f1();
    }

}

class A {
    void f() {

        Data d1 = new Data("Junk");
    }
}