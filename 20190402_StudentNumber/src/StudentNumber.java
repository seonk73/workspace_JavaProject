import java.util.Scanner;

public class StudentNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학번 입력받기 -> 학과 출력하기
		// (학년 1, 2 : 반이 1, 2면 뉴미디어소프트웨어과, 반이 3, 4면 뉴미디어웹솔루션과, 반이 5, 6면 뉴미디어디자인과)
		// (학년 3, 반이 1, 2면 인터렉티브미디어과, 반이 3, 4면 뉴미디어디자인과, 반이 5, 6면 뉴미디어솔루션과)

		System.out.print("학번 입력 : ");

		String studentNumber = sc.nextLine();
		//char로 받으면 equals가 아니라 ==으로 가능, but '' 붙여야함 
		//char로 하면 switch문으로 할 수 있어서 간단해짐

		if (studentNumber.substring(0, 1).equals("3")) {
			if (studentNumber.substring(1, 2).equals("1") || studentNumber.substring(1, 2).equals("2")) {
				System.out.println("인터렉티브미디어과");
			} else if (studentNumber.substring(1, 2).equals("3") || studentNumber.substring(1, 2).equals("4")) {
				System.out.println("뉴미디어디자인과");
			} else if (studentNumber.substring(1, 2).equals("5") || studentNumber.substring(1, 2).equals("6")) {
				System.out.println("뉴미디어솔루션과");
			}
		} else if (studentNumber.substring(0, 1).equals("1") || studentNumber.substring(0, 1).equals("2")) {
			if (studentNumber.substring(1, 2).equals("1") || studentNumber.substring(1, 2).equals("2")) {
				System.out.println("뉴미디어소프트웨어과");
			} else if (studentNumber.substring(1, 2).equals("3") || studentNumber.substring(1, 2).equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			} else if (studentNumber.substring(1, 2).equals("5") || studentNumber.substring(1, 2).equals("6")) {
				System.out.println("뉴미디어디자인과");
			}
		}

	}
}
