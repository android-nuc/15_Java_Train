package cn.edu.nuc.train;
//extends 继承
//重写  父类子类，完全一样
//重写时，权限修饰符 只能扩大不能缩小
	//public protected  没有  private
	//重写的时候是
//子类是父类  父类不一定是子类
//super() 调用父类的构造方法;不写默认调用父类无參的构造方法
public abstract class Chinese extends Person{
	
		public Chinese() {
			System.out.println("调用子类的构造方法");
		}
		public void usekuaizi(){
			System.out.println("使用筷子");
		}
		public  void head(){
			System.out.println("用头想赚钱");
		}
		public abstract void hand();
}
