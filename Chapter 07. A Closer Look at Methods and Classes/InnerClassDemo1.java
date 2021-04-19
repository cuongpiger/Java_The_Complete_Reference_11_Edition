class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10; // y là biến local thuộc Inner

        void display() {
            System.out.println("Inside Inner.display(), call Outer.outer_x = " + outer_x);
        }
    }

    void showy() {
        System.out.println("--> This is Outer.showy()");
        // System.out.println(y); // dòg này sai, ko thể access đến biến Inner.y dc
    }
}

class InnerClassDemo1 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
        outer.showy();
    }
}
