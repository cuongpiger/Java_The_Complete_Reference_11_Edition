interface CallBack {
    void callback(int param);
}

class Client implements CallBack {
    public void callback(int p) { // bắt buộc method phải là public
        System.out.println("Client.callback() với giá trị p = " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Một p.thức thông thường trong một class của Java");
    }
}

class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("--> AnotherClient.callback()");
        System.out.println("    p^2 = " + (p * p));
    }
}

class TestIface2 {
    public static void main(String args[]) {
        CallBack c = new Client(); // dùng interface để tạo một object từ class khác
        AnotherClient ac = new AnotherClient();

        c.callback(7);

        System.out.println();
        c = ac;
        c.callback(42);
    }
}
