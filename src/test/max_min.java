package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class max_min {
	
	public static String solution(String str) {
		String[] tmp = str.split(" ");
		//리스트 함수로 최대/최소 값 구하기 
		ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<tmp.length;i++) {
        	arr.add(Integer.parseInt(tmp[i]));
        }
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        return min + " " + max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 공백 입력할 때 사용 
		
		System.out.printf("최대,최소값 : %s", solution(str));
		
	}

}
