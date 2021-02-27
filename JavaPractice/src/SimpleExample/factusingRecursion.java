package SimpleExample;

public class factusingRecursion {
	static int factr=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=6,result;
//		factusingRecursion f=new factusingRecursion();
		fact(no);
		System.out.println(factr);
	}
	public static void fact(int i)
	{
		if(i>1)
		{
			factr=factr*i;
			fact(i-1);
			 
		}
	}

}
