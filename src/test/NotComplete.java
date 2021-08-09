package test;

import java.util.*;

public class NotComplete {
	
	 public static String solution(String[] participant, String[] completion) {
		 	Arrays.sort(participant);
		 	Arrays.sort(completion);
		 	int i;
		 	for(i = 0;i<completion.length;i++) {
		 		if(!participant[i].equals(completion[i])) {
		 			return participant[i];
		 		}
		 	}
		 	return participant[i];
		 	
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] participant = {"leo", "kiki", "eden","adad"};
		 String[] completion = 	{"eden", "kiki"};
		 System.out.printf("결과 : %s \n",solution(participant,completion));
		 
		 //중복제거 
		 String[] goods = {"notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard"};
		 ArrayList<String> arrayList = new ArrayList<>();
		 
		 for(String item:goods) {
			 if(!arrayList.contains(item)) {
				 arrayList.add(item);
			 }
		 }
		// Collections.sort(arrayList); // 정렬 
		 System.out.println(arrayList);
		 
		 
		 //중복제거2
		 String[] goodsList = {"notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard"};
		 
		 HashSet<String> hs = new HashSet<>();
		 
		 for(String item:goodsList) {
			 hs.add(item);
		 }
		 
		 System.out.println(hs);
		
		 String str1 = "자바코딩";
		 
		 System.out.println(str1.endsWith("코딩"));
	}
	
}
