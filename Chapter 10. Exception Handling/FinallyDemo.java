class FinallyDemo {
    static void procA() {
        try {
            System.out.println("--> Bên trong hàm procA");
            throw new RuntimeException("CÓ LỖI LÀNG NƯỚC ƠI.");
        } finally {
            System.out.println("--> procA block finally.");
        }
    }

    static void procB() {
        try {
            System.out.println("--> Bên trong hàm procB");
            return;
        } finally {
            System.out.println("--> procB block finally.");
        }
    }

    static void procC() {
        try {
            System.out.println("--> Bên trong hàm procC");
            return;
        } finally {
            System.out.println("--> procC block finally.");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception err) {
            System.out.println("==> Lỗi hàm main: " + err);
        }

        procB();
        procC();
    }
}
