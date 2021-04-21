class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread m_thread = Thread.currentThread();
        System.out.println("--> Current thread: " + m_thread);

        // change the name of the thread
        m_thread.setName("Manh Cuong thread");
        System.out.println("--> After name change: " + m_thread);

        try {
            for (int i = 5; i > 0; --i) {
                System.out.println(i);
                Thread.sleep(1000); // ngủ 1 giây
            }
        } catch (InterruptedException err) {
            System.out.println("==> Main thread đã bị ngắt...");
        }
    }
}
