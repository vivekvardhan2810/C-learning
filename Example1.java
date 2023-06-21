// Java implementation to find unique digit
// numbers in a range (Input  like 10 to 15)
//This Solution is taken just for practice not to copy it 
public class Example1
{
	static void printUnique(int l, int r)
	{
		for (int i=l ; i<=r ; i++)
		{
			int num = i;
			boolean visited[] = new boolean[10];
	
			while (num != 0)
			{
				if (visited[num % 10])
					break;
	
				visited[num%10] = true;
	
				num = num/10;
			}
			if (num == 0)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[])
	{
		int l = 10, r = 15;
		printUnique(l, r);
	}
}
