// Java program to find the smallest number whose
// digits multiply to a given number n
// This code is just for practice not to plagarise it
class Example2
{
	static void findSmallest(int n)
	{
		int i, j=0;
		int MAX = 50;
		int[] res = new int[MAX];

		if (n < 10)
		{
			System.out.println(n+10);
			return;
		}

		// Case 2: Start with 9 and try every possible digit
		for (i=9; i>1; i--)
		{
			while (n%i == 0)
			{
				n = n/i;
				res[j] = i;
				j++;
			}
		}

		if (n > 10)
		{
			System.out.println("Not possible");
			return;
		}

		for (i=j-1; i>=0; i--)
			System.out.print(res[i]);
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		findSmallest(10);
                findSmallest(13);
	}
}
