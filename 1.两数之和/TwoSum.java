/**
����һ����������nums��һ��Ŀ��ֵ
target�������ڸ��������ҳ���ΪĿ��ֵ��������������
���������ǵ������±ꡣ����Լ���ÿ������ֻ���Ӧһ���𰸡�
���ǣ�������ͬһ��Ԫ�ز���ʹ�����顣
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
					System.out.println("���������ֱ�Ϊ��" + nums[i] + "��" + nums[j]) ;
					return new int [] {i,j} ;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}