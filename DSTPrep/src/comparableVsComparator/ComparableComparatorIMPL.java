package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorIMPL {

	public static void main(String[] args) {
		List<Student> students = new ArrayList();
			Student st1 = new Student("AStudent",3);
			Student st2 = new Student("VStudent",4);
			Student st3 = new Student("NStudent",1);
			Student st4 = new Student("MStudent",2);
			Student st5 = new Student("HStudent",5);
			Student st6 = new Student("VStudent",0);
			Student st7 = new Student("KStudent",9);
			students.add(st1);
			students.add(st2);
			students.add(st3);
			students.add(st4);
			students.add(st5);
			students.add(st6);
			students.add(st7);
		for(int i=0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		Collections.sort(students);
		for(int i=0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		students.sort(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student){
					return ((Student)o1).name.compareTo(((Student)o2).name);
				}
				return -1;
			}
			
		} 
				
				
				);
		
		for(int i=0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		
		
		
	}	

}
