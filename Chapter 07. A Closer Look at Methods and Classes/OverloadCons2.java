class Box {
    double width, height, depth;

    // copy constructor
    Box(Box other) {
        width = other.width;
        height = other.height;
        depth = other.depth;
    }

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

class OverloadCons2 {
    public static void main(String args[]) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);
        Box box_clone = new Box(box1);

        System.out.println("Thể tích của box1 là: " + box1.volume());
        System.out.println("Thể tích của box2 là: " + box2.volume());
        System.out.println("Thể tích của box3 là: " + box3.volume());
        System.out.println("Thể tích của box_clone là: " + box_clone.volume());
    }
}