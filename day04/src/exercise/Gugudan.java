package exercise;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int j = 2 ; j < 10 ; j++)
		{
			for(int h = 1; h < 10 ; h++)
			{
				if(j < h) break;
				System.out.println(j + "x" + h + "=" + (j*h));
			}
			System.out.println();
		}
	}
}
