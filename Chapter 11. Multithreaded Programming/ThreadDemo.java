class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread"); // tham số this ý muốn ns luồn ms sẽ dc khởi chạy trên đối tượng này.
        System.out.println("--> Thread con: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("---> Thread con: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException err) {
            System.out.println("---> Thread con bị ngắt...");
        }

        System.out.println("---> Kết thúc hàm NewThread.run()");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // tạo ra một luồng mới
        nt.t.start(); // khởi động thread

        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("---> Thread chính: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException err) {
            System.out.println("---> Thread chính bị ngắt...");
        }

        System.out.println("---> Kết thúc hàm main()...");
    }
}
