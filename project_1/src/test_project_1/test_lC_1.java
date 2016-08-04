package test_project_1;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import project_1.lC_1;

public class test_lC_1 {
	private int[] nums;
	private int target;
	private int[] index = new int[2];

	@Before
	public void beforeTestBegain() {
		nums = new int[] { 2, 7, 11, 15 };
		target = 9;
	}

	@Test
	public void test() {
		lC_1 lC = new lC_1();
		index = lC.twoSum(nums, target);
		Assert.assertEquals("twoSum method have some thing wrong!", index[0], 2);
		Assert.assertEquals("twoSum method have some thing wrong!", index[1], 7);
		System.out.println("index1=" + index[0] + ", " + "index2=" + index[1]);
	}
}
