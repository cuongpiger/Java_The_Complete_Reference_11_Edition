class Exc2 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;

            System.out.println("Dòng này sẽ ko bao h dc in ra.");
        } catch (ArithmeticException err) { // bắt lỗi chia cho 0
            System.out.println("==> Lỗi chia 0.");
        }

        System.out.println("--> Dòng này dc in ra sau khi bắt lỗi.");
    }
}
