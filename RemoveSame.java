public class RemoveSame {
	public static void main(String args[]) {
		int nums[] = new int [] {0,1,2,0,1,3,2,1,4,3} ;
		remove(nums) ;
	}
	
	public static int remove(int [] nums){
		if (nums.length == 0) {
			return 0 ;
	    }
		java.util.Arrays.sort(nums) ;
		int i = 0 ;
		for(int j = 0 ; j < nums.length ; j++){
			if(nums[j] != nums[i]){
				i += 1 ;
				nums[i] = nums[j] ;
			}
		}
		System.out.println("删除重复元素后数组元素数为：" + (i + 1)) ;
		System.out.print("删除重复元素后数组为：") ;
		for(int k = 0 ; k <= i ; k++){
			System.out.print(nums[k] + "、") ;
		}
		return 1 ;
	}
}