package p2;

class Protection2 extends p1.Protection {
    Protection2() {
        System.out.println("--> Protection2");

        // System.out.println("    n = " + n); // Error
        // System.out.println("    n_pri = " + n_pri); // Error

        System.out.println("    n_pro = " + n_pro);
        System.out.println("    n_pub = " + n_pub);
    }
}
