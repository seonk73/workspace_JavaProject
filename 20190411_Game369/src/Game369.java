// 1부터 99까지 
// 숫자에 3, 6, 9가 포함 -> "짝" 출력
// 아니면, 숫자 출력 (숫자를 문자로 봐야함)
public class Game369 {
	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			// 숫자를 문자열로 바꾸기
			String numberString = String.valueOf(i);
			// 하나씩 가져와서 '3', '6', '9'의 개수를 셈
			int count = count369(numberString);
			// 개수가 0이면, 숫자출력
			if (count == 0) {
				System.out.println(i);
			} else {
				// 아니면, 개수대로 "짝"출력
				for (int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.println();

			}
		}

	}

	private static int count369(String numberString) {
		// 0부터 length-1까지 반복하며
		// 문자를 하나씩 가져오기
		// 그 문자가 '3', '6', '9'이면 "짝"
		int sum = 0;
		for (int i = 0; i < numberString.length(); i++) {
			char ch = numberString.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				sum++;
			}
		}

		return sum;
	}

}
