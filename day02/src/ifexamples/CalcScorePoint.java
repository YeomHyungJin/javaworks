package ifexamples;

import java.util.Scanner;

public class CalcScorePoint {

	public static void main(String[] args) {
		// 학점 계산
		int score;
		char grade = ' ';
		
		System.out.print("점수는 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		// 조건 처리
		if(score < 100 && score >= 90) grade = 'A';
		else if(score >= 80 && score < 90) grade = 'B';
		else if(score >= 70 && score < 80) grade = 'C';
		else if(score >= 60 && score < 70) grade = 'D';
		else  grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");	
		
		sc.close();
	}

}
