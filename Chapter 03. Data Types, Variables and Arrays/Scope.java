/*
    File `Scope.java`
*/
class Scope {
    public static void main(String args[]) {
        int x = 10; // lúc này biến x dc định nghĩa trên toàn hàm main()

        if (x == 10) { // bắt đầu một scope mới, tạm gọi là s
            int y = 20; // y chỉ dc định nghĩa bên trong scope s
            
            System.out.println("x and y: " + x + " " + y);
            
            // cả x và y đều dc hiểu bên trong scope s này
            x = y * 2;
        }

        // y = 100; // Error!, lúc này y đã rời khỏi scope s và chưa dc khai báo

        // x lúc này vẫn dc hiểu do nó dc định nghĩa trên toàn hàm main()
        System.out.println("x is " + x); 
    } 
}
