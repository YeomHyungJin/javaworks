package arrays;

public class RealNumArray {

	public static void main(String[] args) {
		// �Ǽ��� �迭 ���� �� �����ϱ�
		double[] data = new double[5];
		
		// ���� ����
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		// ��ȸ
		for(int i =0 ; i <data.length; i++)
		{
			System.out.println(data[i]);
		}
		
		// �հ�
		
		double sum = 0.0;
		double times = 0.0;
		
		for(int i = 0 ; i < data.length; i++)
		{
			sum += data[i];
			times *= data[i];
		}
		System.out.println(sum);
		System.out.println(times);
		
	}

}
