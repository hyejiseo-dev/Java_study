package practice;

public class prime_num {
	
	public static boolean isPrimeNum(int n) {
		if (n < 1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int solution(int[] nums){
		int[] num = new int[2];
		int answer = 0;
		int count = 0;
		//3개 수를 뽑아서 더한 후 소수인지 판별 
		for(int i=0;i<nums.length;i++) {  //처음 수 
			for(int j=i+1;j<nums.length;j++) { // 그다음 
				for (int k = j + 1; k < nums.length; k++) { //세번째수 
					answer = nums[i]+nums[j]+nums[k];
					if(isPrimeNum(answer)) {
						count++;
					}
				}
			}
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(solution(nums));
	}

}
