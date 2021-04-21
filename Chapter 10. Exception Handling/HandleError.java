import java.util.Random;

class HandleError {
    public static void main(String args[]) {
        int a, b, c;
        a = b = c = 0;

        Random r = new Random();

        for (int i = 0; i < 32000; ++i) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException err) {
                System.out.println("==> Lỗi chia 0.");
                System.out.println("b & c: " + b + " " + c);

                return;
            }
        }
    }
}
