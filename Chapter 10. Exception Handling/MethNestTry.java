class MethNestTry {
    static void nestTry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
            }

            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("==> Lỗi tràn index mảng: " + err);
        }
    }

    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42/a;

            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException err) {
            System.out.println("==> Lỗi toán học: " + err);
        }
    }
}
