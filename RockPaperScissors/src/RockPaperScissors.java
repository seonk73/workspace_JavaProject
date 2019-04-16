import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		String[] pae = { "가위", "바위", "보" };
		// 입력 받기 (1:가위, 2:바위, 3:보, 0:끝)
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("가위바위보 ! (1 : 가위, 2 : 바위, 3 : 보) : ");

			int p = sc.nextInt();
			if (p == 0) {
				break;
			}
			// 컴퓨터의 패를 구하자
			int c = makeComputer();
			// 나와 컴퓨터 패 비교
			int result = compare(p, c);
			// 출력
			System.out.println("사용자 : " + pae[p - 1] + "\t컴퓨터 : " + pae[c - 1]);
			if (result == -1) {
				System.out.println("짐");
			} else if (result == 0) {
				System.out.println("비김");
			} else {
				System.out.println("이김");
			}
		}
//		if(p == 1) {
//			System.out.println("사용자 : 가위");
//		} else if (p == 2) {
//			System.out.println("사용자 : 바위");
//		} else if (p == 3) { 
//			System.out.println("사용자 : 보");
//		}
//		System.out.println("결과 : "+ result);
	}

	private static int compare(int p, int c) {
		// -1 -> 사용자가 졌음
		// 0 -> 비김
		// 1 -> 사용자가 이겼음
//		if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if ((p + 1) % 3 == c % 3) {
			return -1;
//		} else if ((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		} else if (p == c) {
			return 0;
		} else {
			return 1;
		}

	}

	private static int makeComputer() {
		Random random = new Random();
		int c = random.nextInt(3 - 1 + 1) + 1;
		return c;
	}

}
