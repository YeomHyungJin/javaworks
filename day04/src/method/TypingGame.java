package method;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"dog", "cat", "bird", "cow", "horse", "turtle", "lion", "tiger", "sheep", "chicken"};
		int n = 1; //문제 번호
		Scanner sc = new Scanner(System.in);
		long start, end;
		
		// 영어 타자게임 화면
		System.out.print("영어 타자 게임, 준비되면 엔터");
		sc.nextLine();
		start = System.currentTimeMillis()/1000;
		
		while(n<11)
		{
			int r = (int)(Math.random()*word.length); // 배열이라 +1 필요 없음.
			System.out.println("문제" + n);
			String q = word[r];
			System.out.println(q);
			
			String ans = sc.nextLine();
			
			if(ans.equals(q)) 
			{
				System.out.println("통과");
				n++;
			}
			else
			{
				System.out.println("오타! 다시도전!");
			}
		}
		System.out.println("프로그램 종료");
		end = System.currentTimeMillis()/1000;
		float time = (float)end-start;
		System.out.println("걸린시간은 "+time+"초입니다.");
		sc.close();
		
	}

}
