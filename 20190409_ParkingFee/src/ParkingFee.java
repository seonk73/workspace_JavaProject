//최초 30분은 1500원, 이후 10분은 1000원씩 추가
//주차요금 출력하자
//5 -> 1500, 30 -> 2500, 40 -> 3500, 41 -> 4500
//분을 입력받자
//1분 이상 30분 이하는 1500원
//30분 초과 40분 이하는 3500원
//40분 초과 50분 이하는 4500원

public class ParkingFee {
	public static void main(String[] args) {
		//분을 입력받아 
		int minutes = 52;
		int fee = 0;
		
		if(minutes<=30) {
			//분 <= 30 이면, 1500
			fee = 1500;
		} else {
			//아니면, 분은 30, 요금+=1500
			minutes = minutes - 30;
			fee += 1500;
			//요금 += (분/10)*1000
			fee += (minutes/10)*1000;
			//분%10!=0, 요금에 += 1000
			if(minutes % 10 != 0) {
				fee += 1000;
			}
			
		}
		System.out.println("주차요금은 "+fee+"원입니다.");
	
	}
}
