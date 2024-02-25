package Day10.Ex02_NestedInterface;
//기능 클레스
public class ImplClass implements I.J{

	@Override
	public void methodA() {
		System.out.println("중첩 인터페이스 - methodA()");
		
	}

	@Override
	public void methodB() {
		System.out.println("중첩 인터페이스 - methodB()");
		
	}
        
}
