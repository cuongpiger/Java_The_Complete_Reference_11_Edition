class Factorial {
    int fact(int n) {
        int res;

        if (n == 1) {
            return 1;
        }

        res = fact(n - 1) * n;
        return res;
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("3 giai thừa bằng " + f.fact(3));
        System.out.println("4 giai thừa bằng " + f.fact(4));
        System.out.println("5 giai thừa bằng " + f.fact(5));
    }
}
