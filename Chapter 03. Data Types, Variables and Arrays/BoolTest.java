/*
    File `BoolTest.java`
*/
class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        // nếu b == true
        if (b) System.out.println("This is executed.");

        System.out.println("10 > 9 is " + (10 > 9));
    }
}
