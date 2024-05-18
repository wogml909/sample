package Team.MyBank;

public class Bank {
	  private Account[] accounts;
	    private long vault;

	    public Bank() {
	        this.accounts = new Account[1000];
	        this.vault = 1_000_000_000_000L; // 1조
	    }

	    // Method to add an account
	    public void addAccount(Account account) {
	        for (int i = 0; i < accounts.length; i++) {
	            if (accounts[i] == null) {
	                accounts[i] = account;
	                return;
	            }
	        }
	        System.out.println("더 이상 계좌를 추가할 수 없습니다.");
	    }

	    // Method to get the total balance of all accounts
	    public long getTotalBalance() {
	        long total = 0;
	        for (Account account : accounts) {
	            if (account != null) {
	                total += account.getBalance();
	            }
	        }
	        return total;
	    }

	    // Method to check if the bank vault has enough money
	    public boolean hasEnoughVault(long amount) {
	        return amount <= vault;
	    }
}
