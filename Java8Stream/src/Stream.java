import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
public static void main(String[] args) {
	
	
	Map<Integer,String>emp=new HashMap<Integer,String>();
	
	emp.put(10,"Ram");
	emp.put(55,"sham");
	emp.put(23, "Vaibhav");
	emp.put(25,"Pranav");
	
	//Iterating using java 8
	emp.forEach((k,v)->System.out.println("Key is\t"+k+"\tvalue is\t"+v));
	
	//sorting map using java 8
	
	Map<Integer,String>sortedEmp=emp.entrySet().stream().sorted(Map.Entry.comparingByKey())
	.collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
	System.out.println(sortedEmp);
	
	
	
	
	
	
	
	
	
	
}
}
