package cn.edu.nuc.collection;

public class Wolf extends Dongwu{
		public String name;
		public Wolf(){
			
		}
		public Wolf(String name){
			this.name=name;
			super.name=name;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
}
