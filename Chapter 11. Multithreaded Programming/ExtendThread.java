class NewThread extends Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("---> Luồng con: " + this);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("---> Luồng con: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException err) {
            System.out.println("---> Luồng con kết thúc...");
        }

        System.out.println("---> Kết thúc hàm NewThread.run()...");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();

        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("--> Luồng chính: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException err) {
            System.out.println("--> Luồng chính kết thúc...");
        }

        System.out.println("--> Kết thúc hàm main()...");
    }
}
