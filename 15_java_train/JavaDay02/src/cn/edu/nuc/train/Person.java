package cn.edu.nuc.train;

//Shift+Alt+s 快速生成代码快捷键
//this指向当前对象

//构造方法，方法名必须和类名一样 没有返回值
//大括号代表方法的实现
//abstract 代表抽象，用到方法前面代表此方法没有实现
//用到类前面代表此类是抽象类，有抽象方法的类就是抽象类
//抽象类不能实例化，有方法未实现；

//类的东西不能调用对象的东西；
public  class Person {
		private String id;
		private String eye;
		private String ear;
		private String hand;
		private String head;
		public static int eyenum=2;
		static class Inner{
			public  void say() {
				System.out.println("外部类的id是");
			}
		}
		public Person(String id){
			System.out.println("调用父类有參的构造方法");
		}
		public Person(){
			System.out.println("调用父类无參的构造方法");
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getHead() {
			return head;
		}
		public void setHead(String head) {
			this.head = head;
		}
		//重载:方法名一样 参数类，个数不一样,在同一个类中
		public void see(String s){
			System.out.println("使用眼睛看"+s);
		}
		public void see(){
			System.out.println("使用眼睛看");
		}
		public void hear(){
			System.out.println("使用耳朵听");
		}
		
		public  void hand(){}
		protected void head(){
			System.out.println("用头想如何打LOL");
		}
		
}
