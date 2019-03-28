import java.util.Random;
import java.util.Scanner;

//1 ~ 100 까지 숫자 말하고 컴퓨터가 Up & Down해서 숫자 맞추기

public class UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ---
		Random random = new Random();
		int rNumber = random.nextInt(100 + 1); // 100하면, index이므로 0 ~ 99
		
		while (true) {
			System.out.print("1부터 100까지의 수 입력 : ");
			int Num = sc.nextInt();
			if (Num > rNumber) {
				System.out.println("Down");
			} else if (Num < rNumber) {
				System.out.println("Up");
			} else if (Num == rNumber) {
				System.out.println("Nice");
				break;
			} 
		}
	}

}
