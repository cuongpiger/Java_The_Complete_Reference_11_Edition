/*
    File `LifeTime.java`
*/
class LifeTime {
    public static void main(String args[]) {
        for (int x = 0; x < 3; x++) {
            int y = -1;

            System.out.println("y is: " + y); // y dc khởi tạo mỗi khi truy cập vào scope này

            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
