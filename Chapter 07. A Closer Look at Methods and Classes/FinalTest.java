class FinalTest {
    final String DATABASE = "./data/db_STUDENTS.txt";

    void showDB() {
        // DATABASE = "./data/db_PRODUCTS.txt"; // sai, ko thể thay đổi nếu dc định nghĩa là final
        System.out.println("DATABASE's path: " + DATABASE);
    }

    public static void main(String args[]) {
        FinalTest tmp = new FinalTest();
        tmp.showDB();
    }
}
