package method;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���밪
//		int v1 = Math.abs(-10);
//		System.out.println("v1 = "+v1);
//		
//		// �ݿø�
//		long v2 = Math.round(5.67);
//		System.out.println("v2 = "+v2);
//		
//		// ����
//		double v3 = Math.floor(2.54);
//		System.out.println("v3 = "+v3);
//		
//		// �ִ�
//		int v4 = Math.max(10, 30);
//		System.out.println("v4 = "+v4);
//		
//		// ����
//		double v5 = Math.random();
//		System.out.println("v5 = "+v5);
//		
//		// �ֻ��� ��
//		int v6 = (int)(Math.random()*6) +1;
//		System.out.println("v6 = "+v6);
//		
//		// �ֻ��� 10�� ������
//		for(int i = 0 ; i< 10 ;i ++)
//		{
//			int v7 = (int)(Math.random()*6) +1;
//			System.out.println(v7);
//		}
		
		// ���ڸ� �����ϰ� �̾Ƴ���
		String[] word = {"��", "��", "�츮"};
		int r = (int)(Math.random()*word.length); // �迭�̶� +1 �ʿ� ����.
		System.out.println(r);
		System.out.println(word[r]);
//		for(String w : word)
//		{
//			System.out.println(w);
//		}
		
	}

}
