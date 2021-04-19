import java.util.stream.StreamSupport;

class VarArgs5 {
    static void vaTest(int x, int ...v) {
        System.out.println("vaTest(int, int ...) - x: " + x);
        System.out.print("v contents: ");

        for (int val: v) {
            System.out.print(val + " ");
        }
    }

    static void vaTest(int x) {
        System.out.println("vaTest(int) - x: " + x);
    }

    public static void main(String args[]) {
        vaTest(1);
    }
}
