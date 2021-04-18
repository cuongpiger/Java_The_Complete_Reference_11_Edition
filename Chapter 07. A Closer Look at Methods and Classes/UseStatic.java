class UseStatic {
    static int a = 3;
    static int b;
    int c = 100;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // System.out.println("c = " + c); // sai vì static method chỉ có thể truy cập đến các static variable
    }

    // khai báo một static block (khối tĩnh)
    static {
        System.out.println("Đây là khối tĩnh dc khai báo");
        b = a * 4;
        // c = 10; // dòng này cũng sai, vì statai method chỉ có thể truy cập vào static variable
    }

    public static void main(String args[]) {
        System.out.println("--> Gọi hàm meth() lần đầu");
        meth(42);

        System.out.println("--> Gọi hàm meth() lần hai");
        meth(69);
    }
}
