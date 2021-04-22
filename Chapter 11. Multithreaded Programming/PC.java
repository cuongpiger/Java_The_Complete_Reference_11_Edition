class Q {
    int n;
    boolean value_set = false;

    synchronized int get() {
        while (!value_set) {
            try {
                wait();
            } catch (InterruptedException err) {
                System.out.println("--> Ngắt set...");
            }
        }

        System.out.println("Got: " + n);
        value_set = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (value_set) {
            try {
                wait();
            } catch (InterruptedException err) {
                System.out.println("--> Ngắt put...");
            }
        }
        this.n = n;
        value_set = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Thread thread;

    Producer (Q q) {
        this.q = q;
        thread = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread thread;

    Consumer(Q q) {
        this.q = q;
        thread = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.thread.start();
        c.thread.start();

        System.out.println("--> Nhấn Ctrl + C để dừng...");
    }
}
