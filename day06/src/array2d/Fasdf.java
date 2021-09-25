package array2d;

public class Fasdf {

	public static void main(String[] args) {
		int[][] a = new int[1][3];
		int[] b = new int[3];
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		
		for(int i = 0 ; i < a.length; i ++)
		{
			for(int j = 0 ; j < a[i].length ; j ++)
			{
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		for(int i = 0 ; i < b.length ; i ++)
		{
			System.out.print(b[i] + " ");
		}
	}

}
