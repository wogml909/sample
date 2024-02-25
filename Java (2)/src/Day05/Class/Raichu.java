package Day05.Class;

//상속
//-키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {
	//부모생성자 그대로 만들기 : ALT + SHIFT + S,C
 	public Raichu() {
		super();
	}
	public Raichu(int energy, String type) {
		super(energy, type);		
	}
	//메소드 오버라이딩
	// : 부모 클래스의 메소드를 자식 클래스에서 재정의하여
	// 부모 메소드를 무시하고, 자식 메소드를 우선하여 실행
	public String aAttack() {
	    System.out.println(super.aAttack());
		return "백만볼트";
	}
	public String bAttack() {
		return "볼트체인지";
	}
	public String cAttack() {
		return "아이언테일";
	}
	

}
