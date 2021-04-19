class VarArgs2 {
    static void vaTest(String msg, int ...v) {
        System.out.println("msg: " + msg + " - v.length: " + v.length);
        System.out.print("Content of v: ");

        for (int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("Hủ tiếu", 10);
        vaTest("trân châu, plan, kem", 1, 2, 3);
        vaTest("Ko có varargs");
    }
}
