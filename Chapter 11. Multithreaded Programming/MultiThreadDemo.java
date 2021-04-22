class NewThread implements Runnable {
    String name; // tên của luồng
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
            System.out.println("--> " + name + " bị ngắt...");
        }
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Luffy");
        NewThread nt2 = new NewThread("Conan");
        NewThread nt3 = new NewThread("Sai Tama");

        nt1.thread.start();
        nt2.thread.start();
        nt3.thread.start();

        // Đợi 3 luồng trên chạy xong
        try {
            Thread.sleep(10000);
        } catch (InterruptedException err) {
            System.out.println("-> Luồng chính bị ngắt");
        }

        System.out.println("-> Kết thúc hàm main()...");
    }
}
