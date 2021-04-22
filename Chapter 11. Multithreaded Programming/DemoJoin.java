class NewThread implements Runnable {
    String name;
    Thread thread;

    NewThread(String thread_name) {
        name = thread_name;
        thread = new Thread(this, name);
        System.out.println("--> New thread: " + thread);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("--> " + name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException err) {
            System.out.println("-->" + name + " bị ngắt...");
        }

        System.out.println("--> Kết thúc NewThread.run()...");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Cửu âm chân kinh");
        NewThread nt2 = new NewThread("Hàn long thập bát chưởng");
        NewThread nt3 = new NewThread("Đả cẩu bổng pháp");

        nt1.thread.start();
        nt2.thread.start();
        nt3.thread.start();

        System.out.println("Thread " + nt1.name + " is alive: " + nt1.thread.isAlive());
        System.out.println("Thread " + nt2.name + " is alive: " + nt2.thread.isAlive());
        System.out.println("Thread " + nt3.name + " is alive: " + nt3.thread.isAlive());

        try {
            System.out.println("Đợi luyện xong 3 bộ võ công trên...");
            nt1.thread.join();
            nt2.thread.join();
            nt3.thread.join();
        } catch (InterruptedException err) {
            System.out.println("-> Luồng chính bị ngắt...");
        }

        System.out.println("Thread " + nt1.name + " is alive: " + nt1.thread.isAlive());
        System.out.println("Thread " + nt2.name + " is alive: " + nt2.thread.isAlive());
        System.out.println("Thread " + nt3.name + " is alive: " + nt3.thread.isAlive());

        System.out.println("-> Hàm main() kết thúc...");
    }
}
