import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceDemo {
public static void main(String[] args) {
	
	String s="Java featured 8 are easy to understand";
	
	long cnt=s.codePoints().filter(ch->ch=='e').count();
	System.out.println(cnt);
	
	
	
	String str="Communication";
	
	Map<String,Long>result=Arrays.stream(str.split("")).map(String::toLowerCase)
			.collect(Collectors.groupingBy(j ->j,LinkedHashMap::new,Collectors.counting()));
	System.out.println(result);
	
}
}
