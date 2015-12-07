package cn.edu.nuc.train;


//一个文件下可以建多个类,但只能有一个public类 ,而且这个类名必须和文件名相同
//规范：一个文件对应一个类，特殊情况除外；
//匿名内部类  没有名字的内部类1.实现接口，重写方法2.没有名字的类
//用匿名内部类重写人的行为接口，see 用明亮的眼睛看  hand 用手创造幸福，并调用see和hand方法
public class Test {
	public static void main(String[] args) {

//		Person xijinping=new Person("5655566");
//		xijinping.see();
//		xijinping.setHead("大");
//		System.out.println(xijinping.getHead());
//		System.out.println(xijinping.getId());
//		System.out.println(Person.eyenum);
		//Chinese likeqiang=new Chinese();
//		likeqiang.setId("66666666666666");
//		System.out.println(likeqiang.getId());
//		likeqiang.usekuaizi();
		//likeqiang.head();
//		Person p=new Person();
//		p.head();
//		Chinese c=new Chinese();
//		c.head();
		//声明是什么就是什么
		//子类去覆盖了父类的方法
		//父类会把相同的东西拿到，里面包含重写
		//instanceof 判断一个对面到底是哪个类的实例
//		Person p=new Americ();
//		if(p instanceof Chinese){
//			System.out.println("p是Chinese");
//		}
//		Chinese wangqishan=new Chinese("555555555");
//		Person p=new Chinese();
//		PersonBehavior pb=new AmericanBehavior();
//		pb.see();
		Person p=new Person();
		p.setId("88888888888888");
		Person.Inner in=new Person.Inner();
		in.say();
		PersonBehavior pb=new PersonBehavior() {
			
			@Override
			public void see() {
				// TODO Auto-generated method stub
				System.out.println("用明亮的眼睛看");
			}
			
			@Override
			public void hand() {
				// TODO Auto-generated method stub
				System.out.println("用手创造幸福");
			}
		};
		pb.see();
		pb.hand();
	}

}