class BankAccount {
    int balance = 100;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try {
                // Delay to simulate moeny being widthrawn
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ", remaining: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw $" + amount + ", but insufficient funds.");
        }
    }
}

class WithdrawTask implements Runnable {
    BankAccount account;

    public WithdrawTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(10);
        }
    }
}

public class RaceCondEx1 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount();

        Thread t1 = new Thread(new WithdrawTask(sharedAccount), "Thread #1");
        Thread t2 = new Thread(new WithdrawTask(sharedAccount), "Thread #2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: $" + sharedAccount.balance);
    }
}