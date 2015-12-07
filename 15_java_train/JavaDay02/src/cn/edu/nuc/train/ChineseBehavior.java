package cn.edu.nuc.train;

public class ChineseBehavior implements PersonBehavior{
		
	@Override
	public void see() {
		System.out.println("用黑眼睛看");
		
	}
	@Override
	public void hand() {
		System.out.println("用手成就梦想");
	}

}
