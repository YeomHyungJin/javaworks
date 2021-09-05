package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� ��� ����� �����ϼ���.");
		System.out.println("R : �Ѹ龿 ���ʷ� ���");
		System.out.println("L : ��Ⱑ ���� ���� �������� ���");
		System.out.println("P : �켱 ������ ���� �� ���� ���");
		
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		if(ch == 'R')
		{
			scheduler = new RoundRobin();
		}
		else if(ch == 'L')
		{
			scheduler = new LeastJob();
		}
		else if(ch == 'P')
		{
			scheduler = new PriorityAllocation();
		}
		else
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
