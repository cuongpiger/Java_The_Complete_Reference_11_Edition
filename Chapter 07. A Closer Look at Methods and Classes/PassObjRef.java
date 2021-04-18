class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test other) {
        other.a *= 2;
        other.b /= 2;
        // Các thuộc tính của một object sẽ bị thay đổi khi kết thúc phương thức
    }
}

class PassObjRef {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);

        System.out.println("Giá trị của ob.a và ob.b trc khi gọi hàm meth: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("Giá trị của ob.a và ob.b sau khi gọi hàm meth: " + ob.a + " " + ob.b);
    }
}
