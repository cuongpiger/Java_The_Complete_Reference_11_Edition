class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}

class RefVarDemo {
    public static void main(String args[]) {
        var mc = new MyClass(10);

        System.out.println("Giá trị của i trong mc: " + mc.geti());
        mc.seti(69);
        System.out.println("Giá trị của i trong mc sau khi set(): " + mc.geti());
    }
}
