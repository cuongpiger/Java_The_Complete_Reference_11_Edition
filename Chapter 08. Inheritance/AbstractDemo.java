abstract class A {
    abstract void callme();

    void callmetoo() {
        System.err.println("Đây là một phương thức cụ thể");
    }
}

class B extends A {
    void callme() {
        System.err.println("Method callme của class B.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
