class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " đang trong hàm A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception err) {
            System.out.println("Hàm A.foo() bị ngắt.");
        }

        System.out.println("Kết thúc hàm A.foo() và gọi hàm B.last()...");
        b.last();
    }

    synchronized void last() {
        System.out.println("Bên trong hàm A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " đang trong hàm B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception err) {
            System.out.println("Hàm B.bar() bị ngắt.");
        }

        System.out.println("Kết thúc hàm B.bar() và gọi hàm A.last()...");
        a.last();
    }

    synchronized void last() {
        System.out.println("Bên trong hàm B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Thread thread;

    Deadlock() {
        Thread.currentThread().setName("Luồng chính");
        thread = new Thread(this, "RacingThread");
    }

    void deadlockStart() {
        thread.start();
        a.foo(b);
        System.out.println("Quay về luồng chính...");
    }

    public void run() {
        b.bar(a);
        System.out.println("Quay về một luồng khác...");
    }

    public static void main(String[] args) {
        Deadlock dl = new Deadlock();
        dl.deadlockStart();
    }
}
