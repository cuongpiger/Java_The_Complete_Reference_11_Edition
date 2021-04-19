class VarArgs {
    static void vaTest(int ...v) {
        System.out.println("Số lượng args: " + v.length);
        System.out.print("Các thành phần của args: ");

        for (int x: v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
