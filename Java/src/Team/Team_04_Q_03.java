
package Team;

public class Team_04_Q_03 {

	public static void main(String[] args) {
		boolean one = false;
		boolean ten = false;

		for (int i = 1; i < 99; i++) {
			int a = i % 10;
			int b = i / 10;

			one = a == 3 || a == 6 || a == 9;
			ten = b == 3 || b == 6 || b == 9;

			if (one && ten) {
				System.out.println("**\t");
			} else if (one) {	
				System.out.println("*");
			} else if (ten) {
				System.out.println("*");
			} else {
				System.out.println(i + "\t");
			}
			if (i % 10 ==0) {
				System.out.println(i);
			}
		}
	}


	}