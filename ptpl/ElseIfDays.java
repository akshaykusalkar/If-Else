package ptpl;

public class ElseIfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to show Day Name according to Day Number ( 1 - 7 ) using else-if ladder statement.
		
		int day;

		day = 7;

		if( day == 1 )
			System.out.println( " Monday." );
		else if( day == 2 )
			System.out.println( " Tuesday." );
		else if( day == 3 )
			System.out.println( " Wednesday." );
		else if( day == 4 )
			System.out.println( " Thursday." );
		else if( day == 5 )
			System.out.println( " Friday." );
		else if( day == 6 )
			System.out.println( " Satarday." );
		else if( day == 7 )
			System.out.println( " Sunday." );
		else
			System.out.println( " Wrong Day Number." );

	}

}
