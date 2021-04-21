class ChainExcDemo {
    static void demoProc() {
        NullPointerException err = new NullPointerException("CÓ LỖI LÀNG NƯỚC ƠI");
        err.initCause(new ArithmeticException("lỗi là tại mày, chia 0 nè con"));

        throw err;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException err) {
            System.out.println("==> Lỗi: " + err);
            System.out.println("==> Nguyên nhân: " + err.getCause());
        }
    }
}
