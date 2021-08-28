package method;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절대값
//		int v1 = Math.abs(-10);
//		System.out.println("v1 = "+v1);
//		
//		// 반올림
//		long v2 = Math.round(5.67);
//		System.out.println("v2 = "+v2);
//		
//		// 버림
//		double v3 = Math.floor(2.54);
//		System.out.println("v3 = "+v3);
//		
//		// 최댓값
//		int v4 = Math.max(10, 30);
//		System.out.println("v4 = "+v4);
//		
//		// 랜덤
//		double v5 = Math.random();
//		System.out.println("v5 = "+v5);
//		
//		// 주사위 눈
//		int v6 = (int)(Math.random()*6) +1;
//		System.out.println("v6 = "+v6);
//		
//		// 주사위 10번 던지기
//		for(int i = 0 ; i< 10 ;i ++)
//		{
//			int v7 = (int)(Math.random()*6) +1;
//			System.out.println(v7);
//		}
		
		// 문자를 랜덤하게 뽑아내기
		String[] word = {"나", "너", "우리"};
		int r = (int)(Math.random()*word.length); // 배열이라 +1 필요 없음.
		System.out.println(r);
		System.out.println(word[r]);
//		for(String w : word)
//		{
//			System.out.println(w);
//		}
		
	}

}
