interface Alpha {
    default void reset() {
        System.out.println("--> Đây là Alpha.reset()");
    }
}

interface Beta extends Alpha { // Beta kế thừa Alpha
    default void reset() {
        System.out.println("--> Đây là Beta.reset()");
    }
}

class MyClass implements Alpha, Beta {
    public void reset() {
        System.out.println("--> Đây là MyClass.reset()");
    }
}

class DemoMultiInter2 {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        ob.reset();
    }
}
