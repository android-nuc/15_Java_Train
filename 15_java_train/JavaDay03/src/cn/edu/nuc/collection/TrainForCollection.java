package cn.edu.nuc.collection;

import java.util.ArrayList;

public class TrainForCollection {
			//集合
		public static void main(String[] args) {
//			int[] a=new int[]{1,2,3,4,5};
//			//对象数组
//			Sheep[] sheep=new Sheep[]{
//			new Sheep("喜洋洋"),new Sheep("美羊羊"),new Sheep("懒羊羊"),
//			new Sheep("慢羊羊"),new Sheep("沸羊羊")};
//			System.out.println(sheep[2].name);
			//add 添加  size获取对象数量  get(i)得到第i个对象
			ArrayList<Sheep> sheepList=new ArrayList();
			sheepList.add(new Sheep("喜洋洋"));
			sheepList.add(new Sheep("美羊羊"));
			sheepList.add(new Sheep("懒羊羊"));
			sheepList.add(new Sheep("慢羊羊"));
			sheepList.add(new Sheep("沸羊羊"));
			//sheepList.add(new Sheep("美羊羊"));
			int num=sheepList.size();
			for(int i=2;i<sheepList.size();){
				sheepList.remove(i);
				
				
			}
				
			for(int i=0;i<sheepList.size();i++){
			System.out.println(((Sheep)(sheepList.get(i))).name);
			}
//			//for-each循环格式
//			//for(元素类型 元素名：List){}
//			for(Object s:sheepList){
//				System.out.println(((Sheep)s).name);
//			}
//			//Linkedlist对比ArrayList自学
		}

}
