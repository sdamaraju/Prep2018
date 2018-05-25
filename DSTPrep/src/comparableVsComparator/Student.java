package comparableVsComparator;

public class Student implements Comparable {

	public String name;
	public int id;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String toString(){
		return this.id + " "+ this.name;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			//return 0;
			return this.id - ((Student)o).id;
		}
	return -1;
	}
	
	
	public int hashCode(){
		return id;
	}
}
