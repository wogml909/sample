package Day16.Board.Service;

import java.util.List;

import Day16.Board.DTO.Board;


/*  2. dao에서 board게시판 매핑을 가져와서 글번호 넘기고 객체타입 받아온다 
	 * 게시판 프로그램의 인터페이스 게시판의 기능 메소드 게시글 목록 게시글 조회 게시글 등록 게시글 수정 게시글 삭제
	 **/

	public interface BoardService {
		//게시글 목록
		List<Board> list();
		//게시글 조회
		Board select(int no);
		//게시글 등록
		int insert(Board board);
		//게시글 수정
		int update(Board board);
		//게시글 삭제 int delete (int no)<-넘버를 받아와서 int delete로구현
	    int delete (int no);
	}

