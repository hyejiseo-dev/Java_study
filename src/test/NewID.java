package test;

public class NewID {
	public static String solution(String new_id) {
		//1단계 : 소문자로 바꾸기 
		String answer = new_id.toLowerCase();
		
		// 2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		 answer = answer.replaceAll("[^-_.a-z0-9]", ""); 
		 
		// 3단계 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		 answer = answer.toString().replace("..", ".");
	        while (answer.contains("..")) {
	        	answer = answer.replace("..", ".");
	        }
	    // 4단계 : 앞 뒤 문자에 . 이 있다면 제거
	       answer = answer.replaceAll("^[.]|[.]$", "");    
	     
	   // 5단계 : 빈 문자열이라면, new_id에 "a"를 대입합니다.
	     if (answer.equals("")) {    
	    	 answer += "a";
	        }
	     //6단계 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	     //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.

	     if (answer.length() >= 16) {   
	            answer = answer.substring(0, 15);
	            answer = answer.replaceAll("[.]$","");
	        }
	  // 7단계 : 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	     if (answer.length() <= 2) {  
	            while (answer.length() < 3) {
	                answer += answer.charAt(answer.length()-1);
	            }
	        }
		return answer;
	}
	
	public static void main(String[] args) {
		 System.out.printf("%s",solution("=.="));
	}
	
}
