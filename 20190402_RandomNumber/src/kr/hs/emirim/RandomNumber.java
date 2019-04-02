package kr.hs.emirim;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int start = 0;
		int end = 99;
		Random random = new Random(); 
		int randomNumber = random.nextInt(end + 1 - start) + start; //start~end 랜덤숫자 뽑기 / start 값을 더해져야함
		System.out.println(randomNumber);		
	}
}
