package Day09.Ex01_Computer;

public class User {
 public static void main(String[] args) {
	Computer computer = new DeskTop();
	//Computer computer2 = new Laptop();
	//추상 클래스는 객체로 생성할 수 없다.
	
	Computer computer2 = new MacBook();
	LapTop laptop = new MacBook();
	MacBook macbook = new MacBook();
	
	computer.on();
	computer.display();
	computer.typing();
	computer.off();
	System.out.println();
	
	computer2.on();
	computer2.display();
	computer2.typing();
	computer2.off();
	System.out.println();
	
	laptop.on();
	laptop.display();
	laptop.typing();
	laptop.off();
	
	
	macbook.on();
	macbook.display();
	macbook.typing();
	macbook.off();
	System.out.println();
}
}
