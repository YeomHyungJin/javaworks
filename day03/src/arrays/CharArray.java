package arrays;

public class CharArray {

	public static void main(String[] args) {
		// 문자열 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// 인덱싱 - "K7"
		System.out.println(cars[3]);
		
		// "Morning"을 "BMW"로 변경
		cars[0] = "BMW";
		System.out.println(cars[0]);
		
		// 전체 출력
		for(int i =0 ; i< cars.length; i++)
		{
			System.out.print(cars[i] + ", ");
		}
		System.out.println();
	
		
		
		// 항상 for문
//		System.out.println("==항상 for문==");
//		for(String car : cars)
//		{
//			System.out.print(car + ", ");
//		}
//		
//		System.out.println();
		
//		// 알파벳을 대문자를 배열에 저장
//		char[] alphabet = new char[26];
//		char ch = 'A';
//		
//		for(int i = 0 ; i < alphabet.length; i++)
//		{
//			alphabet[i] = ch;
//			ch++;
//			System.out.println((int)alphabet[i] +", "+ alphabet[i]);
//		}
		
//		System.out.println(alphabet[0]);
	}

}
