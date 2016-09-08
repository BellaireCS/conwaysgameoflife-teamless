import java.lang.Math;
public class GameOfLife {
	
	int[][] grid = new int[10][10];
	int[][] newgrid = new int[10][10];
	
	public GameOfLife(int[][] a)
	{
		grid=a;
	}
	
	public void oneCell(int row, int col)
	{
		row = row + 10;
		col = col + 10;
		int c = 0;
		if (grid[(row+1)%10][col%10] == 1)
			c++;
		if (grid[(row-1)%10][col%10] == 1)
			c++;
		if (grid[row%10][(col+1)%10] == 1)
			c++;
		if (grid[row%10][(col-1)%10] == 1)
			c++;
		if (grid[(row+1)%10][(col+1)%10] == 1)
			c++;
		if (grid[(row-1)%10][(col-1)%10] == 1)
			c++;
		if (grid[(row+1)%10][(col-1)%10] == 1)
			c++;
		if (grid[(row-1)%10][(col+1)%10] == 1)
			c++;
		if (c <= 1)
			newgrid[row%10][col%10] = 0;
		else if (c == 2 || c == 3)
			newgrid[row%10][col%10] = 1;
		else
			newgrid[row%10][col%10] = 0;
	}
	
	public void oneRun()
	{
		for (int row = 0; row < 10; row++)
		{
			for (int col = 0; col < 10; col++)
			{
				oneCell(row,col);
			}
		}
	}
	
	public String toString()
	{
		String printed="";
		for (int row = 0; row < 10; row++)
		{
			for (int col = 0; col < 10; col++)
			{
				printed=printed+newgrid[row][col];
			}
			printed+="\n";
		}
		return printed;
	}
	
	public int[][] Board()
	{
		return newgrid;
	}
}
