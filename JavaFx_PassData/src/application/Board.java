package application;

import java.util.Date;

//3.변수에 접근하는 GETTER SETTER 정의 
//      게시글정보
//      게시글 번호
//      제목
//      작성자
//      내용
//      등록일자
//      수정일자
//      조회수
	
public class Board {
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	private int view;
	

	//생성자
	
	public Board() {
	 this("제목없음", "글쓴이없음", "내용없음");
	}
	
   // 매개변수 포함 생성자
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
	}
 

	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + "]";
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}


	
}
      

