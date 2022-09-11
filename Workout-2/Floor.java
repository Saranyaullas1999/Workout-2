import java.util.*;
class Tile	
{
	int edge;
	int area;
	
	Tile()
	{
	}

	Tile(int edge)
	{
		this.edge = edge;
	}
	
	int Area()
	{
	        area = edge * edge;
		return area;
	}


}

class Floor
{
	int length, width;

	Floor()
	{
	}

	Floor(int length,int width)
	{
		this.length = length;
		this.width = width;
	}

	
	void totalTiles(Tile t)
	{
		double tileArea = t.Area();
		double floorArea = length * width;
		double noOfTiles = floorArea/tileArea;
		System.out.println("Number of Tiles :" +noOfTiles);
	}


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the edge of Tile :");
		int tileEdge = sc.nextInt();
		Tile t = new Tile(tileEdge);

		System.out.println("Enter the length and width of Floor :");
		int len = sc.nextInt();
		int wid = sc.nextInt();
	
		Floor f = new Floor(len,wid);
		f.totalTiles(t);
	}
}