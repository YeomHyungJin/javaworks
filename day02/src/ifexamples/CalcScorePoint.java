package ifexamples;

import java.util.Scanner;

public class CalcScorePoint {

	public static void main(String[] args) {
		// ���� ���
		int score;
		char grade = ' ';
		
		System.out.print("������ : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		// ���� ó��
		if(score < 100 && score >= 90) grade = 'A';
		else if(score >= 80 && score < 90) grade = 'B';
		else if(score >= 70 && score < 80) grade = 'C';
		else if(score >= 60 && score < 70) grade = 'D';
		else  grade = 'F';
		
		System.out.println("������ " + grade + "�Դϴ�.");	
		
		sc.close();
	}

}
