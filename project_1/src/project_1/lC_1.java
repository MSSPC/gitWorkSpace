package project_1;

public class lC_1 {
	public int[] twoSum(int[] nums, int target) {
		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i + 1;
					index[1] = j + 1;
					return nums;
				}
			}
		}
		return null;
	}
}
