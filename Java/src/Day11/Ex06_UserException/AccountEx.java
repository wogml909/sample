package Day11.Ex06_UserException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//10000입금
		account.deposit(10000);
		
		//20000출금
		try {
			account.withdraw(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
