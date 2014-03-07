/**本来想不用main函数打印出Hello World，但是在java7的版本中貌似改掉了这点
*最终泡的异常是：
*
*错误: 在类 Hello 中找不到主方法, 请将主方法定义为:
*   public static void main(String[] args)*/
public class Hello
{
	static {
		System.out.println("hello world");
		System.exit(0);
	}
}
