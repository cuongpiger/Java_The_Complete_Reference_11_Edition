class Test {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; // dòg này sai vì `c` dc định nghĩa là private
        ob.setc(100);
        System.out.println("Giá trị của a, b, c lần lượt là: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
