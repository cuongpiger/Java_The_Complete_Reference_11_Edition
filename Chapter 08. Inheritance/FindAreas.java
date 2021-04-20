class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a; dim2 = b;
    }

    double area() {
        System.out.println("Hàm tính diện tích cho class Figure ko dc định nghĩa");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Hàm tính diện tích cho class ectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Hàm tính diện tích cho class Triangle.");
        return dim1 * dim2 / 2;
    }
}


class FindAreas {
    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fr;

        fr = f;
        System.out.println("Diện tích của Figure là: " + fr.area());

        fr = r;
        System.out.println("Diện tích của Rectangle là: " + fr.area());

        fr = t;
        System.out.println("Diện tích của Triangle là: " + fr.area());
    }
}