interface CallBack {
    void callback(int param);
}

abstract class Client implements CallBack {
    static void show() {
        System.out.println("Đây là p.thức Client.show()");
    }
}

class TestIface3 {
    public static void main(String args[]) {
        // CallBack c = new Client(); // dòng này lỗi do lúc này Client là abstract
        Client.show();
    }
}
