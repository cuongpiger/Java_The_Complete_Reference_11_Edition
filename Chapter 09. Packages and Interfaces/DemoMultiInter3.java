interface Alpha {
    default void reset() {
        System.out.println("--> Đây là Alpha.reset()");
    }
}

interface Beta {
    default void reset() {
        System.out.println("--> Đây là Beta.reset()");
    }
}

/*
 * `MyClass` lúc này bị lỗi, do nó kề thừa từ 2 interface là `Alpha` và `Beta`
 *   nhưng cả hai interface này đều có cùng một default method là `reset`, nên lúc
 *   này `MyClass` ko biết liệu nên kế thừa phiên bản nào của hàm `reset`.
 * */
class MyClass implements Alpha, Beta {
    public void reset() {
        System.out.println("--> Đây là MyClass.reset()");
    }
}

public class DemoMultiInter3 {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        ob.reset();
    }
}
