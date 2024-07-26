package Java8.JavaStreams;

import java.util.Arrays;
import java.util.List;

interface Vehicle {
    public static final String tire = "4";
   // public abstract void run();
    public abstract void run(int tire); // This line is commented because it's not used
}

public class MethodReferencePractice {

    public static void print(int i) {
        System.out.print("This is the run method without parameter"+i);
        
    }

    public static void main(String[] args) {
    	 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
    	 
    	 list.stream().filter((value)->(value%2==0)).forEach(System.out::println);
    	 
    }
    
   
}
