enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Đây là tất cả các giá trị trong Apple");
        Apple all_apples[] = Apple.values();

        for (var a: all_apples) {
            System.out.print(a + " ");
        }
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("Giá trị của ap là " + ap);

    }
}
