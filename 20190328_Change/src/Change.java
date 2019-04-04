import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 ~ 7 사이의 수를 입력 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			case 7:
				System.out.println("일요일");
				break;
			default:
				break;
			}
		}

//		if나 switch 사용하지 않고 코딩하기 -> 배열로
//		String[] weekdays = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
//		System.out.println(weekdays[inputString] - 1);
	}

}
