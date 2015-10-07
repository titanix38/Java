
public class Point
{

	private int x;
	private int y;
	
	Point(int xOrigin,int yOrigin)
	{
		x = xOrigin;
		y = yOrigin;
	}
	Point()
	{
		x=0;
		y=0;
	}
	public void move(int newX,int newY)
	{
		//  Action 
		x = newX;
		y = newY;
	}
	
	public void display()
	{
		// Action
		System.out.println("("+x+";"+y+")");
	}	
}
