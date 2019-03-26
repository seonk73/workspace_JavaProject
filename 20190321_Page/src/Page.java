import java.util.Scanner;

//웹사이트를 만든다 한 페이지에 7개의 게시물을 표시한다면, 331개의 게시물은 몇 개의 페이지 링크를 만들어야하는가?
public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//---
		while(true) {
			System.out.print("원하는 게시물의 개수를 입력 : ");
			int post = sc.nextInt();
				if(post % 7 == 0) {
					System.out.println(post / 7);
				} else {
					System.out.println(post / 7 + 1); // +1은 나머지
					break;
				}
		}
		//---
	}
}
