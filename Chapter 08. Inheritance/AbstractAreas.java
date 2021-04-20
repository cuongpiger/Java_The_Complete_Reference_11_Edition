abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a; dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Đây là Rectangle.area()");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Đây là Triangle.area()");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 10); // dòg này sai vì Figure bây h là lớp trừu tượng
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure f;

        f = r;
        System.out.println("Diện tích hình chữ nhật lả: " + f.area());

        f = t;
        System.out.println("Diện tích hình tam giác là: " + f.area());
    }
}
