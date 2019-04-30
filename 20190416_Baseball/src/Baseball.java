import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// *정답 만들기
		//1~9까지 랜덤숫자 3번 뽑자, 중복없이 ! _어려우면 c에 정해놓고 다른 거 먼저 풀기(밑처럼)
		String c = makeComputer();
		
		//무한반복
		while(true) {
		//1~9까지 세자리 숫자 입력
		String p = sc.nextLine();
		// *strike, ball 구하기
		boolean isEnd = play(p, c);
		if(isEnd == true) {
			System.out.println("HIT");
			break;
		}
	  }
	}

	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		//1~9 랜덤숫자
		Random random = new Random();
		for(int i = 0; i < 3; i++) {
		//random.nextInt(end - start+1) + start _랜덤 공식, 3자리로 하면 어떻게 해야할까 ?
			int r = random.nextInt(9 - 1 + 1) + 1;
			String rString = String.valueOf(r);
			//StringBuffer에 넣기전에 있는지 확인하기
			if(!buffer.toString().contains(rString)) {
				buffer.append(rString);
				i++;
			} 
		}
		return buffer.toString();
	}
	
	private static boolean play(String p, String c) {
		int strike = 0;
		int ball = 0;
		//	for i 사용자 인덱스 들고
		for(int i = 0; i < p.length(); i++) {
			//		for j 컴퓨터 인덱스 들고
			for(int j = 0; j < c.length(); j++) {
				if(p.charAt(i) == c.charAt(j)) {
					if(i == j) strike++; 
					else ball++;
					
				}
				
			}
			
		}
		//p, strike, ball 출력하기 (c는 정답이므로 출력 x)
		System.out.println(p + "\tstrike : "+strike+"\tball : "+ball);
		//strike == 입력한 숫자의 길이만큼 나오면, HIT
		
		
		//p와 c가 같을 때, return true;
		if(p.equals(c)) {
			return true;
		
		}
		return false;
	}

}
