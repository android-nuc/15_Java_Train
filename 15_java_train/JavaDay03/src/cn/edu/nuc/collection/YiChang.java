package cn.edu.nuc.collection;

public class YiChang {

	public static void main(String[] args) {
		//try-catch-finall 块里面，try-catch try-finall
		//catch块范围要从小到大
		//第一个是try-catch 本地解决  第二个是throws 向上抛出	
		//抛出异常 throw
		//需要分清受检异常和非受检异常
	}
	public  void jisuan(){
			System.out.println(division(3, 0));
	}
	public  int  division(int a,int b)  
	{
			if(b==0){
				throw new  MyException("除数不能为0");
			}
			return a/b;
	}
}
