/**
给定一个整数数组nums和一个目标值
target，请你在该数组中找出和为目标值的那两个整数，
并返回他们的数组下标。你可以假设每种输入只会对应一个答案。
但是，数组中同一个元素不能使用两遍。
*/
public class TwoSum {
	public static void main(String args[]) {
		int nums[] = new int [] {2,7,11,15} ;
		int target = 22 ;
		twoSum(nums,target) ;
	}
	
	public static int [] twoSum(int [] nums,int target){
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = i + 1 ; j < nums.length ; j++){
				if(nums[j] + nums[i] == target){
					System.out.println("两个整数分别为：" + nums[i] + "、" + nums[j]) ;
					return new int [] {i,j} ;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}