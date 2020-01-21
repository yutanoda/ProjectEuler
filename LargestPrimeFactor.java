public static long result(long x)
	{
	   long a = 2;
	   while ( x > 1 )
	   {
	       if ( ( x % a ) == 0 )
	       {
	           x = x / a;
	       }
	       else
	       {
	          a++;
	       }
	   }
	   return a;
	}