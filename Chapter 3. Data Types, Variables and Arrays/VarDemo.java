/*
    File `VarDemo.java`
*/
class VarDemo {
    public static void main(String args[]) {
        var avg = 10.; // khai báo một biến suy luận avg, lúc này type của nó là double
        System.out.println("Value of avg: " + avg);

        int var = 1; // khai báo một biến có tên là `var` có type là int
        System.out.println("Value of var: " + var);

        // điều thú vị chổ này là ta vừa khai báo một biến suy luận và nhận giá trị của biến ta
        // đặt tên là `var` trc đó sau đó nhân cho -1
        var k = -var; 
        System.out.println("Value of k: " + k);
    }
}
