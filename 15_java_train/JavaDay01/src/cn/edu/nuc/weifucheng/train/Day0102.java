package cn.edu.nuc.weifucheng.train;

public class Day0102 {
	//不能在static方法里面调用非static方法
	//如何交换2个数，利用一个函数？
	//求2个数的最大公约数 辗转相除法
	static void zzxc(int a,int b){
		if(b==0) {
			System.out.println(a); return ;
		}
		zzxc(b,a%b);
	}
	public static void main(String[] args) {
		int a=40;
		int b=28;
		zzxc(b,a);
		/*for(int i=28;i>1;i--){
			if(a%i==0&&b%i==0){
				System.out.println(i);
				break;
			}
		}
		while(true){
			int t=a%b;
			a=b;
			b=t;
			if(b==0){
				System.out.println(a);
				break;
			}
			
		}*/
		// TODO Auto-generated method stub
		/*Integer a=new Integer(6);
		Integer b=new Integer(5);
		getday01(a,b);
		System.out.println(a+","+b);
		int[][] l=new int[4][];*/
//		int [][] a=new int[3][4];
//		int [][] b=new int[4][3];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				a[i][j]=2;
//			}
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			for(int j=0;j<b[i].length;j++)
//			{
//				b[i][j]=3;
//			}
//		}
//		gettest02(a,b);
	}
//	 static int[]  getday01(int  x,int  y){
//		x=x^y;
//		y=x^y;
//		x=x^y;
//		int[] a=new int[8];
//		System.out.println(x+","+y);
//		return a;
//	}
	 //一个方法，完成矩阵相乘
	 /*static int[][] gettest02(int[][] x,int [][] y){
		 int [][]c=new int[x.length][y[0].length];
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 for(int k=0;k<3;k++)
				 {
					 c[i][k]+=x[i][j]*y[j][k];
				 }
			 }
		 }
		 for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		 return c;
	 }*/
}
