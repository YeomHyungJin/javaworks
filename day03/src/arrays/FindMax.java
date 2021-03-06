package arrays;

public class FindMax {

	public static void main(String[] args) {
		// 최대값 찾기
		int[] arr = {3, 7, 2, 5, 4};
		int max = arr[0]; // max값을 0번 인덱스로 초기화
		
		for(int i = 1; i < arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		// 최대값의 위치
		int max_idx = 0;	// 0번 인덱스로 설정
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[max_idx] < arr[i])
			{
				max_idx = i;
			}
		}
		
		System.out.println("최대값 위치 : arr["+max_idx+"]");
		
		int min = arr[0];
		// 최솟값 찾기
		for(int i = 1; i < arr.length; i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("최소값 : "+min);

		int min_idx = 0 ;
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[min_idx] > arr[i])
			{
				min_idx = i;
			}
		}
		System.out.println("최소값 위치 : arr["+min_idx+"]");
	}

}
