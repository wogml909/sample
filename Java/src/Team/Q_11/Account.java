<<<<<<< HEAD
package Team.Q_11;
/*

 * -예금주
 * -계좌번호
 * -잔액
 * */
public class Account {

	//변수
	private String deposit;
	private String depositor;
	private int depoNumber;
	private int pw;	
			
	//기본생성자 generater constrcter using flied + 체크 모두 지우고 생성

		public Account() {
			this("계좌없음","이름없음",0,0);
	}

	//모든 매개변수가 있는 생성자
	
		public Account(String string, String depositor, int depoNumber, int pw) {
		this.deposit = string;
		this.depositor = depositor;
		this.depoNumber = depoNumber;
		this.pw = pw;
	}

		public String getDeposit() {
			return deposit;
		}

		public void setDeposit(String deposit) {
			this.deposit = deposit;
		}

		public String getDepositor() {
			return depositor;
		}

		public void setDepositor(String depositor) {
			this.depositor = depositor;
		}

		public int getDepoNumber() {
			return depoNumber;
		}

		public void setDepoNumber(int depoNumber) {
			this.depoNumber += depoNumber;
		}


		public int getPw() {
			return pw;
		}

		public void setPw(int pw) {
			this.pw = pw;
		}

		@Override
		public String toString() {
			return "Account [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", pw="
					+ pw + "]";
		}
		

=======
package Team.Q_11;
/*

 * -예금주
 * -계좌번호
 * -잔액
 * */
public class Account {

	//변수
	private String deposit;
	private String depositor;
	private int depoNumber;
	private int pw;	
			
	//기본생성자 generater constrcter using flied + 체크 모두 지우고 생성

		public Account() {
			this("계좌없음","이름없음",0,0);
	}

	//모든 매개변수가 있는 생성자
	
		public Account(String string, String depositor, int depoNumber, int pw) {
		this.deposit = string;
		this.depositor = depositor;
		this.depoNumber = depoNumber;
		this.pw = pw;
	}

		public String getDeposit() {
			return deposit;
		}

		public void setDeposit(String deposit) {
			this.deposit = deposit;
		}

		public String getDepositor() {
			return depositor;
		}

		public void setDepositor(String depositor) {
			this.depositor = depositor;
		}

		public int getDepoNumber() {
			return depoNumber;
		}

		public void setDepoNumber(int depoNumber) {
			this.depoNumber += depoNumber;
		}


		public int getPw() {
			return pw;
		}

		public void setPw(int pw) {
			this.pw = pw;
		}

		@Override
		public String toString() {
			return "Account [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", pw="
					+ pw + "]";
		}
		

>>>>>>> branch 'main' of https://github.com/wogml909/sample.git
}