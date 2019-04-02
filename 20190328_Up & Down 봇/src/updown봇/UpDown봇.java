package updown봇;

import java.util.Random;
import java.util.Scanner;

public class UpDown봇 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int start = 1;
		int end = 100;

		// input(Up/Down/정답) 1: 정답, 2: up, 3: down

		while (true) {
//			int guess = random.nextInt(end - start + 1) + start; //랜덤 기법
			int guess = (end - start)/2; //최적화 기법
			System.out.println(guess + "입니까 ? 1: 정답, 2: up, 3: down");
			int input = sc.nextInt();
			if (input == 2) {
				// up -> guess + 1 ~ end
				start = guess + 1;
			} else if (input == 3) {
				// down -> start ~ guess - 1
				end = guess - 1;
			} else if (input == 1) {
				// == -> "정답", break;
				System.out.println("정답");
				break;
			}

		}
	}
}
