import java.nio.channels.NonWritableChannelException;

class NewThread implements Runnable {
    String name;
    Thread thread;
    boolean suspend_flag;

    NewThread(String thread_name) {
        name = thread_name;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
        suspend_flag = false;
    }

    public void run() {
        try {
            for (int i = 15; i > 0; --i) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);

                synchronized (this) {
                    while (suspend_flag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException err) {
            System.out.println(name + " exiting");
        }
    }

    synchronized void mySuspend() {
        suspend_flag = true;
    }

    synchronized void myResume() {
        suspend_flag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("two");

        ob1.thread.start();
        ob2.thread.start();

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("--> Suspend thread one");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("--> Resume thread one");

            ob2.mySuspend();
            System.out.println("--> Suspend thread two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("--> Resume thread two");
        } catch (InterruptedException err) {
            System.out.println("Main thread interrupted");
        }

        try {
            System.out.println("Đợi các luồng trên dừng");

            ob1.thread.join();
            ob2.thread.join();
        } catch (InterruptedException err) {
            System.out.println("Luồng chính dừng");
        }
    }
}
