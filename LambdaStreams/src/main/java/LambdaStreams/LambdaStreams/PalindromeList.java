package LambdaStreams.LambdaStreams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<n;i++){
			al.add(sc.next());
		}
		ArrayList<String> FilteredList = PalindromeList.filterList(al, PalindromeCheck::isPalindrome);
		System.out.println(FilteredList);
		
	  }	
	public static ArrayList<String> filterList(ArrayList<String> al, Predicate<String> predicate){
		ArrayList<String> result = new ArrayList<String>();
		for(String n : al){
			if(predicate.test(n)){
				result.add(n);
			}
		}
		return result;
	}

	
}
