class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("--> Đây là hàm throwOne()");
        throw new IllegalAccessException("CÓ LỖI LÀNG NƯỚC ƠI!");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException err) {
            System.out.println("==> Lỗi: " + err);
        }
    }
}
