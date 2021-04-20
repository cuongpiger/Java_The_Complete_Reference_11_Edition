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

class TestIface {
    public static void main(String args[]) {
        CallBack c = new Client(); // dùng interface để tạo một object từ class khác
        c.callback(42);
    }
}
