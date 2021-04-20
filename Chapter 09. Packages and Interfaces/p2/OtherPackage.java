package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("--> OtherPackage");

        // System.out.println("    n = " + p.n); // Error
        // System.out.println("    n_pri = " + p.n_pri); // Error
        // System.out.println("    n_pro = " + p.n_pro); // Error
        System.out.println("    n_pub = " + p.n_pub);
    }
}
