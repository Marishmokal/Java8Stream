import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
public static void main(String[] args) {
	ArrayList<Integer>l=new ArrayList<>();
	l.add(10);
	l.add(5);
	l.add(72);
	l.add(12);
	l.add(55);
	l.add(12);
	
	
	//Even numbers
	List<Integer>evenNo=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(evenNo);
	
	
	//odd numbers
	List<Integer>oddNo=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
	System.out.println(oddNo);
	
	//display List
	
//	l.stream().forEach(System.out ::println);
//	
//	//greater than 30
//	l.stream().filter(i->i>10).forEach(System.out::println);
//	
//	//less than 10
//	l.stream().filter(i->i<10).forEach(System.out::print);
	
//	//count numbers
//	int count=(int) l.stream().filter(i->i>10).count();
//	System.out.println(count);
//	
//	//unique numbers
//	List<Integer>unique=l.stream().distinct().collect(Collectors.toList());
//	System.out.println(unique);
//	
//	//sorting
//	List<Integer>sort=l.stream().sorted().collect(Collectors.toList());
//	System.out.println(sort);
//	
//	//maximum number
//	int max=l.stream().max(Integer::compareTo).get();
//	System.out.println("Maximum number is"+max);
//	
//	//minimum number
//	int min=l.stream().min(Integer::compareTo).get();
//	System.out.println(min);
//	
//	//values between two numbers
//	List<Integer>valBet=l.stream().filter(i->i>10 && i<72).collect(Collectors.toList());
//	System.out.println("values between"+valBet);
	
	//reverse/descending order
	Comparator<Integer>reverseOrder=Collections.reverseOrder();
	Collections.sort(l,reverseOrder);
	System.out.println(l);
	
	
	//Using MAP
	
	
	//edit elements
	List<Integer>editElement=l.stream().map(i->i+5).collect(Collectors.toList());
	System.out.println(editElement);
	
	
	
}
}
