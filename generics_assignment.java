package ayushi1;

public class generics_assignment<T> implements Comparable<generics_assignment> {
		T object;
		String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public T getObject() {
			return object;
		}
		public void setObject(T object) {
			this.object = object;
		}
		public int compareTo(generics_assignment  gc) {
			return this.name.compareTo(gc.name);
		}
		public boolean equals(Object obj) {
			if(obj instanceof generics_assignment)  {
				generics_assignment ob = (generics_assignment)obj;
				if(this.name.equals(ob.name)) {
					return this.object.equals(ob.object);
				} else return false;
				
			} else {
				return false;
			}
		} 

	//With String Object(T)
		public static void main(String[] args)
		{
			generics_assignment<String> g1=new generics_assignment<>();
			g1.setName("ayushi");
			g1.setObject("Accolite");
			generics_assignment<String> g2=new generics_assignment<>();
			g2.setName("ayushi");
			g2.setObject("Accolite");
			//Using Equals 
			System.out.println("objects are equal:"+ g1.equals(g2));
			
			//With Integer Object(T)
			generics_assignment<Integer> g3=new generics_assignment<>();
			g3.setName("ayushi");
			g3.setObject(1000);
			generics_assignment<Integer> g4=new generics_assignment<>();
			g4.setName("ayushi");
			g4.setObject(1000);
			//Using Equals 
			System.out.println("objects are equal"+ g3.equals(g4));
		}
	}
