
public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid = new int[10][10];
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				grid[i][j] = (int)(Math.random()*2);
			}
		}
		
		GameOfLife test = new GameOfLife(grid);
		test.oneRun();
		System.out.println(test);
		
		GameOfLife test1 = new GameOfLife(test.Board());
		test1.oneRun();
		System.out.println(test1);
	}

}
