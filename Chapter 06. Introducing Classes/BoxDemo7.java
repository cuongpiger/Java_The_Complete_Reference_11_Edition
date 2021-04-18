class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);
        double vol;

        vol = box1.volume();
        System.out.println("Thể tích box1 là: " + vol);

        vol = box2.volume();
        System.out.println("Thể tích box2 là: " + vol);
    }
}