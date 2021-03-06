package arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		// 배열의 선언과 사용 - 중괄호 블럭안에 초기화 함
		int[] arr = {1, 2, 3, 4};
		
		// 배열의 크기
		System.out.println("배열의 크기 : "+arr.length);
		
		// arr[2]의 값 출력
		System.out.println("수정 전 arr[2] : "+arr[2]);
		
		// arr[2] 값을 수정(변경)
		arr[2] = 6;
		System.out.println("수정 후 arr[2] : "+arr[2]);
		
		int sum = 0;
		// 전체 출력
		for(int i = 0 ; i < arr.length ; i ++)
		{
			sum += arr[i];
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.println();
		System.out.println("배열의 합계는 : "+ sum);
		// 합계
		// 평균
		double avg = 0.0;
		
		avg = (double)sum/arr.length;
		System.out.println("평균: "+avg);
	}
}
