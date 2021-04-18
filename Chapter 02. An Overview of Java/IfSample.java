/*
    Đây là file `IfSample.java`
*/
class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x nhỏ hơn y");

        x = x * 2;
        if (x == y) System.out.println("Bây giờ x bằng y");

        x = x * 2;
        if (x > y) System.out.println("Giờ thì x lớn hơn y");

        // Dòng này ko thỏa if nên sẽ ko in ra
        if (x == y) System.out.println("Dòng này sẽ ko dc in ra");
    }
}
