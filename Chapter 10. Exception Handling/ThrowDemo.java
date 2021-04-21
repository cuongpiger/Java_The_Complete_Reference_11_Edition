class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("CÓ LỖI LÀNG NƯỚC ƠI!!!");
        } catch (NullPointerException err) {
            System.out.println("==> Có lỗi trong method demoProc().");
            throw err;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException err) {
            System.out.println("==> Lỗi: " + err);
        }
    }
}
