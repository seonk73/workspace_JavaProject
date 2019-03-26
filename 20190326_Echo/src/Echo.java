import java.util.Scanner;

//메아리
//사용자가 입력한 것을 그대로 따라하기
//입력, 출력 무한반복
//exit하면 끝내기
public class Echo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ---
		while (true) {
			System.out.print("사용자 입력 : ");
			String inputString = sc.nextLine();
			System.out.println(inputString);
			if (inputString.equals("exit"))
				break;
		}
		// ---
	}

}
