package ch08;

public class GreedyTest {

	public static void main(String[] args) {

		/*
		 * 머니에 간 철수는 8370원의 구매를 가능하게 했습니다. 철수 돈 500원 20개 100원 20개 50원 20개 10원 20개 돈이 올랐습니다. 그 결과 결정적인 결과를 낳을 것입니다. 게임의 성능 향상
			중요하다
			중요시 철수는 500원을 우선으로 합니다. 간단하게 계산해 5 8370 = 00 * 16 + 100 * 3 + 50 * 1 + 10 * 2 가.
			그 결과 엄청난 금액의 결정적인 결과가 나올 것입니다.
			행동의 종류는 없습니다. ..?
		 */
		
		int[] coins = {500, 100, 50, 10};   // 
		int price = 8370;
		int count;
		
		for (int i = 0; i< coins.length; i++) {
			count = 0;
			count += price / coins[i];
			price = price % coins[i]; 
			
			System.out.println( coins[i] + "짜리 동전 " + count + "가 필요합니다.");
		}

	}

}
