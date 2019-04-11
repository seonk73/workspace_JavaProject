import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		//입력 받기 (1:가위, 2:바위, 3:보, 0:끝)
		int p = 1;
		//컴퓨터의 패를 구하자
		int c = makeComputer();
		//나와 컴퓨터 패 비교
		int result = compare(p, c);
		//출력
		System.out.println(result);
	}

	private static int compare(int p, int c) {
		//-1 -> 사용자가 졌음, 0 -> 비김, 1 -> 사용자가 이겼음
		
		return 0;
	}

	private static int makeComputer() {
		Random random = new Random();
		int c = random.nextInt(3-1+1)+1;
		return 2;
	}

}
