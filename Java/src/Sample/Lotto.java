package Sample;
import java.util.Arrays; // 배열을 정렬하기 위해 필요한 클래스
import java.util.Random; // 랜덤한 숫자를 생성하기 위해 필요한 클래스

public class Lotto {

	      public static void main(String[] args) {
		        int[] lotto = new int[6]; // 크기가 6인 배열을 생성
		        Random r = new Random(); // 랜덤 객체를 생성
		        for (int i = 0; i < lotto.length; i++) { // 배열의 길이만큼 반복
		            int num = r.nextInt(45) + 1; // 1부터 45까지의 랜덤한 정수를 생성
		            lotto[i] = num; // 배열의 i번째 위치에 숫자를 저장
		            for (int j = 0; j < i; j++) { // i번째 이전의 위치들을 모두 검사
		                if (lotto[i] == lotto[j]) { // 만약 중복된 숫자가 있다면
		                    i--; // i를 하나 감소시켜서 다시 랜덤한 숫자를 생성하도록 함
		                    break; // 중복 검사를 종료
		                }
		            }
		        }
		        Arrays.sort(lotto); // 배열을 오름차순으로 정렬
		        System.out.println("로또 번호: " + Arrays.toString(lotto)); // 배열을 문자열로 출력
		    }
		}
