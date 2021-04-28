class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showType() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showType();

        System.out.println("ob1 = " + tgObj.getob1());
        System.out.println("ob2 = " + tgObj.getob2());
    }
}
