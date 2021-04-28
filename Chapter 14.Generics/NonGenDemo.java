class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);

        iOb.showType();
        System.out.println("value: " + (Integer) iOb.getob());

        NonGen strOb = new NonGen("Manh Cuong");

        strOb.showType();
        System.out.println("value: " + (String) strOb.getob());
    }
}
