package operator;

public class CalcScore {

	public static void main(String[] args) {
		// 과목의 총점과 평균 구하기
		int mathScore = 100;
		int englishScore = 80;
		int argScore = 60;
		int excerciseScore = 100;
		
		int totalScore = mathScore + englishScore + argScore + excerciseScore;
		// 강제 형변환
		double avgScore = (double)totalScore / 4;
		
		System.out.println("총점은?? "+totalScore);
		System.out.println("평균은?? "+avgScore);
		
		// 증가, 감소 연산자 ++ / --
		int num = 10;
//		System.out.println(num++); // 10
//		System.out.println(num);   // 11
		
		// 전치 연산
//		System.out.println(++num); // 11
//		System.out.println(num);   // 11
		// num++ => num += 1, num = num + 1
		// num-- => num -= 1, num = num - 1
		
		System.out.println("====산술 연산====");
		// 산술 연산
		int n1 = 10;
		int n2 = 4;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

}
