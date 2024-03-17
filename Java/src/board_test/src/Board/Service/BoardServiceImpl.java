package Board.Service;

import java.util.List;

import Board.DAO.BoardDAO;
import Board.DTO.Board;

/**
 * 게시판 기능 -비즈니스 로직 클래스
 * 
 * **/
public class BoardServiceImpl implements BoardService{
	 //2.구현클레스 추상메소드를 불러와서 추가
		//비지니스 로직계층
    	//게시글목록의 기능에대한 업무기능 추가
	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		// 1. DAO 객체에 게시글 목록 요청
		List<Board> boardList = boardDAO.list();
		// 2. 게시글 목록 데이터 가공
		//pass
		// 3. 게시글 목록 반환
		return boardList;
	}

	@Override
	public Board select(int no) {
		// 1.게시글 번호에 대한 게시글 정보 데이터 요청
		Board board = boardDAO.select(no);
		
		// 2.게시글 정보 반환
		return board;
	}

	@Override
	public int insert(Board board) {
		// 1.게시글 정보를 전달하여 게시글 데이터 등록 요청
		int result = boardDAO.insert(board);
		// 2.적용된 데이터 건수를 반환
		//   -결과 : 0--> 데이터 등록 실폐
	    //   -결과 : 1--> 데이터 등록 성공
		//*비지니스 로직 예시 - if(result>0) 포인트 추가
		return result;
	}

	@Override
	public int update(Board board) {
		// 1.게시글 정보를 전달하여 게시글 데이터 수정 요청
		int result = boardDAO.update(board);
		// 2.적용된 데이터 건수를 반환
		//   -결과 : 0--> 데이터 수정 실폐
	    //   -결과 : 1--> 데이터 수정 성공
		return result;
	}

	@Override
	public int delete(int no) {
		// 1.게시글 번호를 전달하여 게시글 데이터 삭제 요청
		int result = boardDAO.delete(no);
		// 2.적용된 데이터 건수를 반환
		//   -결과 : 0--> 데이터 삭제 실폐
	    //   -결과 : 1--> 데이터 삭제 성공
		return result;
	}

}
