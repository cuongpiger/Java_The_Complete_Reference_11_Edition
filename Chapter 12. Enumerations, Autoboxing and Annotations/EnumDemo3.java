enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // giá của từng loại trái

    Apple(int p) {price = p;}

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Gía của Winesap: " + Apple.Winesap.getPrice());

        System.out.println("Giá của tất cả các loại trái: ");
        for (var a: Apple.values()) {
            System.out.println(a + "-" + a.getPrice() + " ");
        }
    }
}
