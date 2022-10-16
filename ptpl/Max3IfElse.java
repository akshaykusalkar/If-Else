package ptpl;

public class Max3IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to find Maximum of Three numbers using Nested-If.
		
		int a, b, c, max;

		a = 23;
		b = 93;
		c = 10;

		if( a > b )
		{
			if( a > c )
				max = a;
			else
				max = c;
	        }
		else
		{
			if( b > c )
				max = b;
			else
				max = c;
		}
		
		System.out.println("\nMaximum : " + max );

	}

}
