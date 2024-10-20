class Methods 
{
	static int a;
	static int b;
	public static void add () 
	{
		a=10;
		b=20;
		int c=a+b;
		System.out.println("The addition of " +" 'a' " + "and" +" 'b' "+ "is" + " " + c);
	}
	public static void mull ()
	{
		int h=10;
		int i=20;
		int j=h*i;
	    System.out.println("The multiplication of " +"'h'"+ "and" +"'i'"+ "is" + " " + j);
	}
	public static void main (String []args)
	{
		 System.out.println("******main starts*****");
	     add();
         System.out.println("******control combacks to main method and mull method starts executed*****");
		 mull();
		 System.out.println("******control combacks to main method and main ends*****");
	}
}

