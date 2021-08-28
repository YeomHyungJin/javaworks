package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		// arr1의 배열 요소를 arr2로 저장
		for(int i = 0 ; i < arr1.length ; i ++)
		{
			arr2[i] = arr1[i];
		}
		
		// arr2를 출력
		for(int i = 0 ; i < arr2.length ; i ++)
		{
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		// 문자형 배열 복사
		char[] ch1 = {'염', '형', '진'};
		char[] ch2 = new char[3];
		
		// ch1의 배열 요소를 ch2로 저장
		for(int i = 0 ; i < ch1.length ; i ++)
		{
			ch2[i] = ch1[i];
			ch2[2-i] = ch1[i]; // 문자열을 역순을 바꾸는 코드
		}
		// ch2를 출력
		for(int i = 0 ; i < ch2.length ; i ++)
		{
			System.out.print(ch2[i]);
		}
	}
}
