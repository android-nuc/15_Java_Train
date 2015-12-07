package cn.edu.nuc.train;

public class AmericanBehavior implements PersonBehavior{

	@Override
	public void see() {
		System.out.println("用蓝色眼睛看");
		
	}

	@Override
	public void hand() {
		System.out.println("用手创造");
		
	}

}
