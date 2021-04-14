package mypack;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public static void main(String args[]) {
        Balance bal = new Balance("Manh Cuong", 22);

        System.out.println(bal.name + " :$" + bal.bal);
    }
}
