package Day06.Ex01_ObjectArray;

import java.util.Scanner;

/*
  * 책 제목, 저자명을 갖는 book 클래스를 정의하고 
  * book 클래스 타입의 객체 배열을 생성하여
  * 사용자로부터 책 3권을 입력받아 출력하는
  * 프로그램을 작성하시오
  * */
	//생성자
  //alt +shift + s, o
	class Book{
		String title, author;
		
		public Book() {
			this("제목없음","작자미상");
			// this.title = "제목없음";
			// this.author = "작자미상";
		}
	
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		//toString()
		// : 객체를 출력문 출력 시, 출력할 템플릿을 지정하는 메소드
		//-Object(최상위클래스)에 정의된 toString()메소드 오버라이딩하면
		//반환값을 춝력문에서 출력하는 객체를 대신하여 출력한다
        //alt + shift + s +generate string
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + "]";
		}
		
	
	}
	//메인 클래스 : 클래스 파일 이름과 클래스 이름이 같아야한다.
	public class BookArray{
		public static void main(String[] args) {
			//book 타입의 객체 배열 선언 및 생성
			 Book[] bookArray = new Book[3];

              Scanner sc = new Scanner(System.in);
              
              //사용자 입력
             for (int i = 0; i < bookArray.length; i++) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("저자 : ");
				String author = sc.nextLine();
				
				//book 객체를 생성하여 객체 배열 bookArray 에 대입
				bookArray[i] = new Book(title, author);
			}              
             
             //출력
             for (Book book : bookArray) {
				System.out.println(book);
			}
             
              sc.close();
		}
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	