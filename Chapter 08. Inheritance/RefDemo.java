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

class RefBox {
    public static void main(String args[]) {
        BoxWeight bw1 = new BoxWeight(3, 5, 7, 8.37);
        Box box = new Box();

        System.out.println("Thể tích của bw1 là: " + bw1.volume());
        System.out.println("Cân nặng của bw1 là: " + bw1.weight);

        box = bw1; // tham chiếu đến bw1
        System.out.println("Biến box tham chiếu bw1.volume(): " + box.volume());
        // System.out.println("Biến box tham chiếu bw1.weight: " + box.weight); // dòng này
            // ko hợp lệ vì Box ko có thuộc tính weight
    }
}
