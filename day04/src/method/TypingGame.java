package method;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"dog", "cat", "bird", "cow", "horse", "turtle", "lion", "tiger", "sheep", "chicken"};
		int n = 1; //���� ��ȣ
		Scanner sc = new Scanner(System.in);
		long start, end;
		
		// ���� Ÿ�ڰ��� ȭ��
		System.out.print("���� Ÿ�� ����, �غ�Ǹ� ����");
		sc.nextLine();
		start = System.currentTimeMillis()/1000;
		
		while(n<11)
		{
			int r = (int)(Math.random()*word.length); // �迭�̶� +1 �ʿ� ����.
			System.out.println("����" + n);
			String q = word[r];
			System.out.println(q);
			
			String ans = sc.nextLine();
			
			if(ans.equals(q)) 
			{
				System.out.println("���");
				n++;
			}
			else
			{
				System.out.println("��Ÿ! �ٽõ���!");
			}
		}
		System.out.println("���α׷� ����");
		end = System.currentTimeMillis()/1000;
		float time = (float)end-start;
		System.out.println("�ɸ��ð��� "+time+"���Դϴ�.");
		sc.close();
		
	}

}
