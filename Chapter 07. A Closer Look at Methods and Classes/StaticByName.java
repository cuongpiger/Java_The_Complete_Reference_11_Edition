class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String args[]) {
        StaticDemo.callme(); // gọi static method `callme` của class `StaticDemo`
        System.out.println("StaticDemo.b = " + StaticDemo.b);
    }
}
