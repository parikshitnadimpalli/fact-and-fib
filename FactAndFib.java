import java.util.*;

class FactAndFib
{
	static void fib()
	{
		int n1 = 0, n2 = 1, n3, i, count = 0;
		System.out.println(n1 + " " + n2);
		for (i=2; i < count; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	static int factorial(int n)
	{
		if (n == 0)
			return 1;
		return (n * factorial(n-1));
	}

	public static void main(String args[])
	{
		int fact = 1, number = 4, ch;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
		fib();
	}
}
