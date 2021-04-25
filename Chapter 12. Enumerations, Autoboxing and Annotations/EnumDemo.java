enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println("Giá trị của ap là " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) {
            System.out.println("ap có giá trị là GoldenDel");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan có màu đỏ");
                break;
            case GoldenDel:
                System.out.println("GoldenDel có màu vàng");
                break;
            case RedDel:
                System.out.println("RedDel có màu đỏ.");
                break;
            case Winesap:
                System.out.println("Winesap có màu đỏ.");
                break;
            case Cortland:
                System.out.println("Cortland có màu đỏ.");
                break;
        }
    }
}
