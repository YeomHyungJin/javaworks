package array2d;

public class Array2dCalc {

	public static void main(String[] args) {
		int[][] nums = {{1, 2, 3, 4},{4, 5, 6}};
		int i, j;
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		// 전체 출력
		for(i = 0 ; i < nums.length; i++)
		{
			for(j = 0 ; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		// 합계와 평균
		for(i = 0 ; i < nums.length; i++)
		{
			for(j = 0 ; j < nums[i].length; j++)
			{
				sum += nums[i][j];
				count ++;
			}
		}
		avg = (double)sum / count;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg); // 서식문자 : %d - 정수, %f - 실수, %s - 문자
	}
}
