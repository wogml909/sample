package Team.MyBank;

public class Account {
	private String accountNumber;
    private String accountHolder;
    private long balance;

    public Account() {
        this.accountNumber = "계좌없음";
        this.accountHolder = "이름없음";
        this.balance = 0;
    }

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getBalance() {
        return balance;
    }

    // The balance can only be set within the allowed range
    public void setBalance(long balance) {
        if (balance >= 0 && balance <= 1_000_000_000) {
            this.balance = balance;
        } else {
            System.out.println("잔고는 0원에서 10억 원 사이여야 합니다.");
        }
    }

    // Method to deposit money within the allowed range
    public void deposit(long amount) {
        if (amount > 0 && amount <= 1_000_000) {
            if (this.balance + amount <= 1_000_000_000) {
                this.balance += amount;
            } else {
                System.out.println("입금 후 잔고가 10억 원을 초과할 수 없습니다.");
            }
        } else {
            System.out.println("입금액은 1원에서 100만 원 사이여야 합니다.");
        }
    }

    // Method to withdraw money within the allowed range
    public void withdraw(long amount) {
        if (amount > 0 && amount <= 1_000_000) {
            if (this.balance - amount >= 0) {
                this.balance -= amount;
            } else {
                System.out.println("잔고가 부족합니다.");
            }
        } else {
            System.out.println("출금액은 1원에서 100만 원 사이여야 합니다.");
        }
    }
}
