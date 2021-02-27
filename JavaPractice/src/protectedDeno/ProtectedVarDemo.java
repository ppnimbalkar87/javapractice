package protectedDeno;

class C 
{
	protected String name = "Pravin";
}

public class ProtectedVarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		System.out.println(obj.name);
		ProtectedVarDemo obj1=new ProtectedVarDemo();
//		System.out.println(obj1.name);//not possible if no inheritance
	}

}
