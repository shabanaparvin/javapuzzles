import java.lang.*;
import java.util.Scanner;
public class Twocircles{	
static int circle(int x1, int y1, int x2, int y2, int r1, int r2)
{
	int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	int radSumSq = (r1 + r2) * (r1 + r2);
	if (distSq == radSumSq)
	{
		return 1;
	}
	else if (distSq > radSumSq)
	{
		return -1;
	}
	else
	{
		return 0;
	}
}

public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
	int x1;
	System.out.print("Enter x1: "); 
	x1 = in.nextInt();	
	int y1;
	System.out.print("Enter y1: ");
	y1 = in.nextInt();	
	int x2;
	System.out.print("Enter x2: ");
	x2 = in.nextInt();	
	int y2;
	System.out.print("Enter y2: ");
	y2 = in.nextInt();	
	int r1;
	System.out.print("Enter r1: ");
	r1 = in.nextInt();	
	int r2;
	System.out.print("Enter r2: ");
	r2 = in.nextInt();
		
	System.out.println("Entered circle coordinates: x1:"+x1 +"y1: "+y1+"x2:"+x2+"y2:"+y2+"r1:"+r1+"r2:"+r2);	
	int t = circle(x1, y1, x2, y2, r1, r2);
	if (t == 1)
	{
		System.out.print("Circle touch to each other.");
	}
	else if (t < 0)
	{
		System.out.print("Circle not touch to each other.");
	}
	else
	{
		System.out.print("Circle intersect to each other.");
		
	
	}
}

}	

