class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);

        System.out.println("Thể tích của box1 là: " + box1.volume());
        System.out.println("Thể tích của box2 là: " + box2.volume());
        System.out.println("Thể tích của box3 là: " + box3.volume());
    }
}