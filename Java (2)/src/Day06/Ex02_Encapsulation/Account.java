package Day06.Ex02_Encapsulation;
/*
 * 통장계좌
 * -예금주
 * -계좌번호
 * -잔액
 * -은행명
 * */
public class Account {

	//변수
	private int deposit;
	private String depositor;
	private String depoNumber;
	private String bank;
		
			
	//기본생성자 generater constrcter using flied + 체크 모두 지우고 생성

		public Account() {
			this(1,"예금주 없음","0000000-00-00000", "은행없음");
	}

	//모든 매개변수가 있는 생성자
	
		public Account(int deposit, String depositor, String depoNumber, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.depoNumber = depoNumber;
		this.bank = bank;
	}
	
	//getter, setter
		public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public String getDepoNumber() {
		return depoNumber;
	}

	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	
	//toString


	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", bank="
				+ bank + "]";
	}
	
}
