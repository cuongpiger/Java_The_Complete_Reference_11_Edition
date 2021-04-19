class Box {
    double width, height, depth;

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
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = h;
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight bw1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight bw2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("Thể tích của bw1 là: " + bw1.volume());
        System.out.println("Cân nặng của bw1 là: " + bw1.weight);

        System.out.println("Thể tích cùa bw2 là: " + bw2.volume());
        System.out.println("Cân nặng của bw2 là: " + bw2.weight);
    }
}
