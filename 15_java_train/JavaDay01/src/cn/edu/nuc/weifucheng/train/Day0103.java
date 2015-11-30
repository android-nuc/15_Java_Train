package cn.edu.nuc.weifucheng.train;

public class Day0103 {
	// 构造块 成员变量 构造函数
	//一旦static修饰，说明这个变量或方法 是属于类的，内容被这个类所有对象共享
	//不是static修饰的成员变量或方法，是分别属于每个对象的
	//静态块是类加载的时候调用，构造块是new 对象的时候调用
	//public protected private  什么都没有
	//public 什么都能用
	//protected 只有本包内使用或子类使用
	//private 只有本类能使用
	//什么都没有	只有本包能使用
	//一般规范，成员变量使用priavte 方法使用public
	//static 和final  final最终的 方法和属性前 类前不能被继承
	String x;
	{
		System.out.println("我是构造块");
	}
	static{
		System.out.println("我是静态块");
	}
		static int a=5;
		protected double b=0.5;
		char c='k';
		boolean d=true;
		
//		public Day0103(int a,double b,char c,boolean d){
//			this.a=a;
//			this.b=b;
//			this.c=c;
//			this.d=d;
//		}
}
