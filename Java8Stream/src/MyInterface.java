
public interface MyInterface {

	public void show();
}
//class Bank implements MyInterface
//{
//
//	@Override
//	public void show() {
//		System.out.println("This is show method");
//		
//	}
//	
//}
class Test
{
	public static void main(String[] args) {
		MyInterface m=()->System.out.println("This is show method");
		m.show();
	}
}
//implementation of LAMBDA expression use functional interface