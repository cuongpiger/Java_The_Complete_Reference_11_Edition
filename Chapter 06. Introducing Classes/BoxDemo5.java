class Box {
    double width, height, depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String args[]) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.setDim(10, 20, 15);
        box2.setDim(3, 6, 9);

        vol = box1.volume();
        System.out.println("Thể tích box1 là: " + vol);

        vol = box2.volume();
        System.out.println("Thể tích box2 là: " + vol);
    }
}