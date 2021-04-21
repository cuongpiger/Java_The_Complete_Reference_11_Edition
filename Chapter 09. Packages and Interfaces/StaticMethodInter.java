interface MyIf {
    int getNumber();

    default String getString() {
        return "Đây là interface MyIf.getString()";
    }

    static int testStaticMethod() {
        return 69;
    }
}

class StaticMethodInter {
    public static void main(String args[]) {
        System.out.println("Gọi static method MyIf.testStaticMethod(): " + MyIf.testStaticMethod());
    }
}
