package LambdaStreams.LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringStartWithAndLength3 {
	public static void main(String[] args) {
//		String [] strArray = {"Hello", "BB", "aGG8", "aKK", "LL", "MM", "aNN"};
//		List<String> strList = Arrays.asList(strArray);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<n;i++){
			al.add(sc.next());
		}
		List<String> resList = filter(al);
		System.out.println(resList);
	  }	
	public static List<String> filter(List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}


}
