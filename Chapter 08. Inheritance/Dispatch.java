class A {
    void callme() {
        System.out.println("Class A.callme()");
    }
}

class B extends A {
    void callme() {
        System.out.println("Class B.callme()");
    }
}

class C extends A {
    void callme() {
        System.out.println("Class C.callme()");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
