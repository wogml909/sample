package Day09.Ex02_Board;
//메인-4
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		BoardInterface boardInterface = new BoardAccess();
        
		int menuNo;
		do {
			System.out.println("======게시판========");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			
			menuNo = sc.nextInt();
			sc.nextLine();  //엔터를 입력버퍼에서 제거
			
			switch (menuNo) {
			case 1: //게시글 목록
				Board[] boardList = boardInterface.list();
				for (Board board : boardList) {
					System.out.println(board);
				}
				break;
			case 2: //게시글 등록
				//입력받기
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("작성자 : ");
				String writer = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				//객체생성
				Board board = new Board(title, writer, content);
				//입력정보가-> boardAccess간다 create메소드 실행
				Board createdBoard = boardInterface.create(board);
				
				if (createdBoard != null) {
					System.out.print("생성된 게시글 정보 : ");
				    System.out.println(createdBoard);
				}
				break;
			case 3 : //게시글 조회
				System.out.println("조회할 글 번호: ");
				sc.nextLine(); //엔터제거
				int no = sc.nextInt();
				Board selectedBoard = boardInterface.read(no);
				if(selectedBoard != null) {
					System.out.println("조회된 게시글 정보 : ");
					System.out.println(selectedBoard);
				}
				break;
			case 4 : //게시글 수정
					//수정게시글 번호, 수정 게시글 정보 입력
				System.out.print("수정할 글 번호 : ");
				int updateNo = sc.nextInt();
				sc.nextLine(); //엔터제거
				System.out.print("제목 : ");
				String updateTitle = sc.nextLine();
				System.out.print("작성자 : ");
				String updateWriter =sc.nextLine();
				System.out.print("내용 : ");
				String updateContent = sc.nextLine();
				
				//객체생성
		        Board updateBoard = new Board(updateTitle, updateWriter, updateContent);
				updateBoard.setNo(updateNo);//게시글번호지정
				//입력정보가-> boardAccess간다 update메소드 실행
				int result = boardInterface.update(updateBoard);
				if(result > 0) {
					System.out.println("게시글 수정을 완료하였습니다.");
				}else {
					System.out.println("게시글 수정에 실폐하였습니다");
				}
						
				    break;
			case 5 : //게시글 삭제
				 System.out.print("삭제할 글 번호 : ");
				 int deletNo = sc.nextInt();
				 sc.nextLine(); //엔터 제거
				 result = boardInterface.delet(deletNo);
				 if(result > 0) {
					 System.out.println("게시글 삭제를 완료하였습니다");
				 }else {
					 System.err.println("게시글 수정에 실폐하였습니다.");
				 }
			    break;
			default:
					break;
			}
		}while(menuNo!= 0);
		System.out.println("프로그램이 종료됩니다.");
	}
	

}
