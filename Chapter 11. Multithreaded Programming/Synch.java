class Callme {
    synchronized void call(String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException err) {
            System.out.println("-> Bị ngắt...");
        }

        System.out.println("] -> " + msg + ": Done");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        thread = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Conan");
        Caller ob2 = new Caller(target, "Kaito");
        Caller ob3 = new Caller(target, "Mori");

        // khởi động các luồng
        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();

        // đợi 3 luồng trên chạy xog
        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException err) {
            System.out.println("-> Trong main() bị ngắt...");
        }
    }
}
