abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Hàm A.callmetoo() tồn tại ở thể vật chất");
    }
}

class B extends A {
    void callme() {
        System.out.println("Hàm B.callme() dc gọi thông qua abstract A.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
