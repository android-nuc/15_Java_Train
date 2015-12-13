package cn.edu.nuc.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrainForSet {

	public static void main(String[] args) {
		// 5只    15        vs    6 只        7
		//HashSet 判等2个规则 equals() hashCode判等
		//Set里面是无序的，无序的，无序的
		//父类和子类之间，属性不覆盖，只有方法覆盖
		//泛型  目的就是为了防止   狼进入羊群
		//泛型  格式：<类型> 没有声明泛型时，集合里面默认放置都是Object类型
		//Object 对象 java是一门面向对象编程的语言  Object是所有类的父类
		Set<Wolf> wolfset=new HashSet<Wolf>();
		wolfset.add(new Wolf("灰太狼"));
		wolfset.add(new Wolf("红太狼"));
		wolfset.add(new Wolf("小灰灰"));
		Set<Sheep> sheepset=new HashSet<Sheep>();
		sheepset.add(new Sheep("喜洋洋"));
		sheepset.add(new Sheep("美羊羊"));
		sheepset.add(new Sheep("懒羊羊"));
		sheepset.add(new Sheep("慢羊羊"));
		sheepset.add(new Sheep("沸羊羊"));
		printfForName(wolfset);
//		for(Object s:sheepset){
//			System.out.println(((Dongwu)s).name);
//		}
//		Set sheepset=new HashSet();
//		sheepset.add("喜洋洋");
//		sheepset.add("美羊羊");
//		sheepset.add("懒羊羊");
//		sheepset.add("慢羊羊");
//		sheepset.add("沸羊羊");
//		sheepset.add("美羊羊");
//		for(Object s:sheepset){
//			System.out.println((String)s);
//		} 
		
	}
	
	//参数：Set集合 将Set集合中的所有元素的名字进行打印
	//返回值：为空值
	static	void printfForName(Set<? extends Dongwu> sheepset){
			//迭代器  每种集合都自带迭代器
			Iterator<? extends Dongwu> itr=sheepset.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next().name);
			}
		}
	

}
