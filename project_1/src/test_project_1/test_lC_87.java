package test_project_1;

import org.junit.Test;

import project_1.lC_87;

public class test_lC_87 {
	private String s1 = "great";
	private String s2 = "rgtae";

	@Test
	public void test() {
		lC_87 lc = new lC_87();
		System.out.println(lc.isScramble(s1, s2));
	}
}
