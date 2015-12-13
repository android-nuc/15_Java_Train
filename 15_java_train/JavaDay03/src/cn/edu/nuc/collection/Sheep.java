package cn.edu.nuc.collection;

	//Shift + Alt + s
public class Sheep extends Dongwu{
		public String name;
		
		private String head;
		private String foot;
		public Sheep(String name){
			this.name=name;
			super.name=name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if(this.name.equals(((Sheep)obj).name)){
				return true;
			}else{
				return false;
			}
		}
		
		
}
