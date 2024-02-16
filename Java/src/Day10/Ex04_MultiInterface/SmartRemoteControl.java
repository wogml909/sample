package Day10.Ex04_MultiInterface;


//인터페이스 다중 상송
//public interface 인터페이스명 extends 인터페이스 A, 인터페이스B ...{}
public interface SmartRemoteControl extends RemoteControl,Microphone{

	
	//터치패드 가능
	//  x,y 좌표 위치에 터치 패드를 클릭
	
	void touch(int x, int y);
	
}
