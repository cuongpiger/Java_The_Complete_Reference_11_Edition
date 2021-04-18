package mypack;

class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }

        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Manh Cuong", 10.9);
        current[1] = new Balance("Nha Hong", 12.7);
        current[2] = new Balance("Nguyet Que", -32.2);

        for (int i = 0; i < 3; ++i) {
            current[i].show();
        }
    }
}