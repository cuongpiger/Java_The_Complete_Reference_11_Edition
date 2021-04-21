class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };

        try {
            // int res = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException err) {
            // bắt nhiều lỗi cùng 1 lúc, ko cần phải chia nh` `catch`
            System.out.println("==> Lỗi: " + err);
        }

        System.out.println("Kết thúc.");
    }
}
