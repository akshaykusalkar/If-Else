package ptpl;

public class Leap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to find given year is leap year or not
		
		int y;

		y = 2016;	

		if( y % 100 == 0 )
		{
			if( y % 400 == 0 )
				System.out.println( " It is a LEAP Year." );
			else
				System.out.println( " It is NOT a LEAP Year." );
		}
		else if( y % 4 == 0 )
			System.out.println("It is a LEAP Year." );
		else
			System.out.println( " It is NOT a LEAP Year." );

	}

}
