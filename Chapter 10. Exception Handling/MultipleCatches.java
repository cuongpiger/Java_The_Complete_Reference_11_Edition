class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("args.length = " + a);

            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException err) {
            System.out.println("==> Lỗi toán học: " + err);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("==> Lỗi tràn vùng nhớ mảng: " + err);
        }

        System.out.println("--> Sau khi bắt xong lỗi.");
    }
}
