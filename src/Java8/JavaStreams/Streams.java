package Java8.JavaStreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Java8.Java.entity.Student;
import Java8.Java.entity.StudentData;

interface predicatee {
	public static final int flag = 12;

	public abstract void test();

}

public class Streams {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4};
		
		//System.out.println(arr);
		System.out.println("This is the java8 branch");
		List<Student> student=StudentData.getStudent();
		
		
		List<Integer> l=List.of(1,2,3,4);
		
		System.out.println(l);
		 
		System.out.println(student);
		
	// student.stream().filter(s->s.getFirstName().startsWith("A")).forEachOrdered(System.out::println);;
	Map<String, List<Student>> collect = student.stream().collect(Collectors.groupingBy(s->s.getDepartmantName()));
	
	for( Map.Entry<String, List<Student>> entry : collect.entrySet())
	{
		//System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	}
}
