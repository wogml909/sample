package Board.Service;

import java.util.List;

import Board.DTO.Board;

/*
 * 게시판 프로그램의 인터페이스
 * 게시판의 기능 메소드
 * -게시글 목록
 * -게시글 조회
 * -게시글 등록
 * -게시글 수정
 * -게시글 삭제
 * **/
public interface BoardService {
 //1. 인터페이스 ,추상메소드 정의 
 //비지니스 로직계층
	
//	게시글 목록 :list컬렉션 안에 요소들을 Board 객체로 담아서 반환해서 가져오는 메소드로 정의
	List<Board> list();
	
//	게시글 조회 :board를 반환타입으로 가져오고 select라는 메소드이름으로 게시글 번호를 메개변수로 넘겨서 받아온다
	Board select(int no);

//	게시글 등록 : 등록된 데이터의 건수를 반환받아온다 사용자가 입력한 게시글을 매개변수로 넘겨준다
	int insert(Board board);
	
//	게시글 수정 : 수정할 게시글정보를 객체로 넘겨주고 수정된 건수를 정수명으로 리턴받는다
	int update(Board board);
	
//	게시글 삭제 : 삭제할 글번호를 전달해서 그 글번호로 데이터를 삭제하도록 만든다
	int delete(int no);
}
