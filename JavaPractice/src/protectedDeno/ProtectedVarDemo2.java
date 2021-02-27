package protectedDeno;

class D 
{
	protected String name = "Pravin";
}

public class ProtectedVarDemo2 extends D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=new D();
		System.out.println(obj.name);
		ProtectedVarDemo2 obj1=new ProtectedVarDemo2();
		System.out.println(obj1.name);//not possible if no inheritance
	}

}
