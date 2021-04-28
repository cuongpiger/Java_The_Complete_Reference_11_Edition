class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);
        iOb.showType();

        System.out.println("value: " + iOb.getob());

        Gen<String> strOb = new Gen<String>("Manh Cuong");
        strOb.showType();

        System.out.println("value: " + strOb.getob());
    }
}
