package pack1;

public class Human {

        private String name;
		private int age;

		Human(String name,int age) {
			this.setName(name);
			this.setAge(age);
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public void copy(Human x) {
			this.setName(x.getName());
			this.setAge(x.getAge());
		}
		
		
		
		
	}


