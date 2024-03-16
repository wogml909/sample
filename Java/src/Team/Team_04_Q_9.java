package Team;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Team_04_Q_9 {
//	(1) 화폐는 고액권을 우선으로 지급, 나머지 금액은 그 다음 단위의 화폐 순서로 지급한다.
//	(2) 화폐 단위는 50000원, 10000원 5000원, 1000원, 500원, 100원, 50원, 10원, 5원, 1원의 10가지 종류가 있다.
//	(3) 입력데이터는 성명, 간식비 지급액이며, 성명의 입력이 "QUIT" 이면 입력의 끝으로 간주한다.
//	(4) 출력은 성명, 간식비 지급액, 개인별 각 화폐 매수, 마지막에 전체 화폐 매수를 출력한다.
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> totalCurrencyCount = new HashMap<>();
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String[][] table = new String[7][11]; // 5명의 사용자 + 헤더 + 합계
        int userCount = 0;

        // 테이블 헤더 설정
        table[0] = new String[]{"성명", "지급액", "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "오원", "일원"};

        while (userCount < 5) {
            System.out.print("성명과 간식비 입력하세요 : ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            int snackCost = Integer.parseInt(parts[1]);

            HashMap<Integer, Integer> currencyCount = calculateCurrency(snackCost, units);
            currencyCount.forEach((key, value) -> totalCurrencyCount.merge(key, value, Integer::sum));

            // 사용자 정보와 화폐 매수를 테이블에 추가
            table[userCount + 1] = new String[]{
                name,
                String.valueOf(snackCost),
                String.valueOf(currencyCount.getOrDefault(50000, 0)),
                String.valueOf(currencyCount.getOrDefault(10000, 0)),
                String.valueOf(currencyCount.getOrDefault(5000, 0)),
                String.valueOf(currencyCount.getOrDefault(1000, 0)),
                String.valueOf(currencyCount.getOrDefault(500, 0)),
                String.valueOf(currencyCount.getOrDefault(100, 0)),
                String.valueOf(currencyCount.getOrDefault(50, 0)),
                String.valueOf(currencyCount.getOrDefault(10, 0)),
                String.valueOf(currencyCount.getOrDefault(5, 0)),
                String.valueOf(currencyCount.getOrDefault(1, 0))
            };
            userCount++;
        }

        // 전체 화폐 매수 합계를 테이블에 추가
        table[6] = new String[]{
            "합계",
            "",
            String.valueOf(totalCurrencyCount.getOrDefault(50000, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(10000, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(5000, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(1000, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(500, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(100, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(50, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(10, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(5, 0)),
            String.valueOf(totalCurrencyCount.getOrDefault(1, 0))
        };

        // 테이블 출력
        for (String[] row : table) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static HashMap<Integer, Integer> calculateCurrency(int amount, int[] units) {
        HashMap<Integer, Integer> currencyCount = new HashMap<>();
        for (int unit : units) {
            currencyCount.put(unit, amount / unit);
            amount %= unit;
        }
        return currencyCount;
    }
}