package Java8.JavaStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import Java8.Java.entity.Student;
import Java8.Java.entity.StudentData;
/* class test
{
	 
	 public static  void test(Student st)
	 {
		 final String roll="xxxxxxxxxxxxx"+st.getAge();
		 System.out.println(roll);
		 
	 }
	
	
	
}*/

public class StreamConcepts {

	private static Object[] array;
	private static Object[] array2;

	public static void main(String[] args) {
		
		
		   List<String> Sentence = List.of("Hello ujjwal","My name what are you doing");
		   
		   array2 = Sentence.stream().map((sen)->Arrays.stream(sen.split(" "))).peek(System.out::println).toArray();
		   HashMap<Integer,String> val=new HashMap<>();
		   val.put(null, "uj");
		   val.put(null, "d");
		   System.out.println(val.get(null));
		   
		   for(Object o:array2)
		   {
			   
		   }
		   
		   
		  // Arrays.stream(array).forEach(System.out::println);
		   
	
	}
}

