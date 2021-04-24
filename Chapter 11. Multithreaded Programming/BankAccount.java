class BankAccount {
    long amount = 5_000_000;
    String account_name = "";

    BankAccount(String account_name) {
        this.account_name = account_name;
    }

    synchronized void withdraw(long amount) {
        System.out.println(account_name + " rút số tiền " + amount + "VND");
        this.amount -= amount;
    }

    synchronized void deposit(long amount) {
        System.out.println(account_name + " nạp số tiền " + amount + "VND");
        this.amount += amount;
    }

    void transferTo(BankAccount other, long amount) {
        synchronized (this) {
            // trừ tiền từ tài khoản này
            this.withdraw(amount);

            // nạp tiền vào tài khoản other
            synchronized (other) {
                other.deposit(amount);
            }

            System.out.println(this.account_name + " số dư là " + this.amount);
            System.out.println(other.account_name + " số dư là " + other.amount);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Manh Cuong");
        BankAccount acc2 = new BankAccount("Nguyet Que");

        Thread thread1 = new Thread() {
            public void run() {
                acc1.transferTo(acc2, 3_000_000);
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                acc2.transferTo(acc1, 2_000_000);
            }
        };

        thread1.start();
        thread2.start();
    }
}
