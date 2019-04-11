package kr.hs.emirim.nsum;

import java.util.Scanner;

public class Nsum {
	public static void main(String[] args) {
		// 숫자를 String으로 입력받기 -> 자릿수를 알기 위해 -> 0 ~ 자릿수 - 1까지 하나씩 잘라서 더해야함
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. ");
		String inputNumber = sc.nextLine();
		nSum(inputNumber);
	}

	private static void nSum(String inputNumber) { //static : 함수의 내용 전체는 메모리에서 움직이면 X -> static
		// 각 자릿수의 수를 더하자
		int length = inputNumber.length();
		// 0 ~ 자릿수 - 1까지 반복하자
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			// 한글자씩 가져와서 숫자로 변환하자 , 한글자는 char 사용
			char n = inputNumber.charAt(i);
			// sum에 그 값을 더하자 / char == '3'은 3이 아님, 51임
			sum += n - '0'; // char를 int 값으로 바꾸기 ! 중요함 ** / 369게임 등 여러 곳에서 사용할 수 있음
		}
		// 더한 값 출력
		System.out.println("입력한 숫자의 합은 "+sum+"입니다.");
	}
}
