package arrays;

public class FindMax {

	public static void main(String[] args) {
		// �ִ밪 ã��
		int[] arr = {3, 7, 2, 5, 4};
		int max = arr[0]; // max���� 0�� �ε����� �ʱ�ȭ
		
		for(int i = 1; i < arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("�ִ밪 : "+max);
		
		// �ִ밪�� ��ġ
		int max_idx = 0;	// 0�� �ε����� ����
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[max_idx] < arr[i])
			{
				max_idx = i;
			}
		}
		
		System.out.println("�ִ밪 ��ġ : arr["+max_idx+"]");
		
		int min = arr[0];
		// �ּڰ� ã��
		for(int i = 1; i < arr.length; i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("�ּҰ� : "+min);

		int min_idx = 0 ;
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[min_idx] > arr[i])
			{
				min_idx = i;
			}
		}
		System.out.println("�ּҰ� ��ġ : arr["+min_idx+"]");
	}

}