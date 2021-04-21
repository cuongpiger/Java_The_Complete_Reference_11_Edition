interface MyIf {
    int getNumber();

    default String getString() {
        return "--> Đây là p.thức MyIf.getString()";
    }
}

class MyIfImp implements MyIf {
    /*
     * Chỉ có thể định nghĩa các p.thức ko có keyword `default` trong class `MyIf`
     * */
    public int getNumber() {
        return 69;
    }

    public String getString() {
        return "--> Đây là p.thức MyIfImp.getString()";
    }
}

class DefaultMethodDemo2 {
    public static void main(String args[]) {
        MyIfImp ob1 = new MyIfImp();

        System.out.println(ob1.getNumber());
        System.out.println(ob1.getString());
    }
}
