interface DemoInterface
{
	public int addition(int a,int b);
}
public class DemoLambdaExpression {
public static void main(String[] args) {
	
	DemoInterface d=(a,b)->a+b;
	
	int ans=d.addition(10, 20);
	System.out.println(ans);
}
}
