class A {
    public interface NestIf {
        boolean isNegative(int x);
    }
}

class B implements A.NestIf {
    public boolean isNegative(int x) {
        return x >= 0 ? true : false;
    }
}

class NestedIfDemo {
    public static void main(String args[]) {
        A.NestIf nif = new B();

        if (nif.isNegative(10)) {
            System.out.println("10 là số dương");
        }

        if (!nif.isNegative(-69)) {
            System.out.println("-69 là số âm");
        }
    }
}
