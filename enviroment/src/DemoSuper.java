import javax.swing.text.BoxView;

class Box {
    private double width, height, depth;

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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String args[]) {
        BoxWeight bw1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight bw2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight bw3 = new BoxWeight();
        BoxWeight bw4 = new BoxWeight(3, 2);
        BoxWeight bw5 = new BoxWeight(bw1);

        System.out.println("Thể tích của bw1 là: " + bw1.volume());
        System.out.println("Cân nặng của bw1 là: " + bw1.weight);

    }
}
