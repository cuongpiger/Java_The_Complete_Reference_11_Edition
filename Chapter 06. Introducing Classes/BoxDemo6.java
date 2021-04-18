class Box {
    double width, height, depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String args[]) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        vol = box1.volume();
        System.out.println("Thể tích box1 là: " + vol);

        vol = box2.volume();
        System.out.println("Thể tích box2 là: " + vol);
    }
}