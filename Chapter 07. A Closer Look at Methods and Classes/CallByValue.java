class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
        // Biến tấu cỡ nào cũng ko thay đổi giá trị của i và j sau khi kết thúc phương thức
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("Giá trị của a và b trc khi gọi hàm meth: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("Giá trị của a và b sau khi gọi hàm meth: " + a + " " + b);
    }
}
