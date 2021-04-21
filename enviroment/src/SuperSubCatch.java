class SuperSubCatch {
    public static void main(String args[]) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (Exception err) {
            System.out.println("==> Lỗi ngoại lệ: " + err);
        } /* catch (ArithmeticException err) {
            System.out.println("==> Lỗi toán học: " + err);
        } */
        /*
        * Dòng trên ko cần thiết, vì ArithmeticException là lớp con của Exception, nên
        *   nếu lỗi Exception dc bắt thì lỗi ArithmeticException sẽ ko bao h dc chạy, nên
        *   Java sẽ la làng lên ns là m code ngu, code thừa, thông báo lỗi chính tả.
        * */
    }
}
