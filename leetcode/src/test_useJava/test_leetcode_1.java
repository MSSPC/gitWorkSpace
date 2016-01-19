package test_useJava;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import useJava.leetcode_1_TwoSum;

public class test_leetcode_1 {
	private int[] nums;
	private int target;
	private int[] index = new int [2];

	@BeforeMethod
	public void beforeTestBegain() {
		nums = new int[] { 2, 7, 11, 15 };
		target = 9;
	}

	@Test
	public void test1(){
		leetcode_1_TwoSum leet = new leetcode_1_TwoSum();
		index = leet.twoSum(nums, target);
		System.out.println("index1="+index[0]+", "+"index2="+index[1]);
	}
}
