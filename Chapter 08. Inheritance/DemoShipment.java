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

class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment other) {
        super(other);
        cost = other.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String args[]) {
        Shipment ship1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment ship2 = new Shipment(2, 3, 4, .76, 1.28);

        System.out.println("Thể tích của ship1 là: " + ship1.volume());
        System.out.println("Cân nặng của ship1 là: " + ship1.weight);
        System.out.println("Chi phí của ship1 là: " + ship1.cost);
        System.out.println();

        System.out.println("Thể tích của ship2 là: " + ship2.volume());
        System.out.println("Cân nặng của ship2 là: " + ship2.weight);
        System.out.println("Chi phí của ship2 là: " + ship2.cost);
    }
}
