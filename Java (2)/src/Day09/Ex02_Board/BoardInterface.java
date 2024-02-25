package Day09.Ex02_Board;
/** 기능에 대한 정의-2
 * 게시판 인터페이스
 * 데이터 등록
 * 데이터 조회
 * 데이터 수정
 * 데이터 삭제
*/

public interface BoardInterface {
     //데이터 등록
	Board create(Board board);
	
	//데이터 목록
	Board[] list();
	
	//데이터 조회
	Board read(int no);
	
	//데어터 수정
	int update(Board board);
	
	//데어터 삭제
	int delet(int no);
}
