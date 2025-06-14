package day_019_date_2024_06_14;

public class MaximumDifferenceByReMappingOneDigit {

	public static void main(String[] args) {
		int num = 90;
		System.out.println(minMaxDifference(num));
	}

	public static int minMaxDifference_Mine(int num) {
		// int len = (int)Math.log10(num)+1;

//		int min = Integer.MAX_VALUE;
//		
//			int[] nums = new int[len];
//		
//		for(int i=0; i<len; i++) {
//			nums[i] = num%10;
//			num/=10;
//		}
//		
//		int place = 1;
//		int max = Integer.MIN_VALUE;
//		for(int i=0; i<len; i++) {
//			if()
//		}
//		
//		int ans = max-min;

		String s = num + "";

		char c[] = s.toCharArray();

		char changingNum = ' ';
		boolean found = false;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == '9') {
				continue;
			}
			if (!found) {
				changingNum = c[i];
				found = true;
			}
			if (c[i] == changingNum) {
				c[i] = '9';
			}
		}

		int highestNum = Integer.parseInt(new String(c));

		c = s.toCharArray();
		found = false;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				continue;
			}
			if (!found) {
				changingNum = c[i];
				found = true;
			}
			if (c[i] == changingNum) {
				c[i] = '0';
			}
		}

		int lowestNum = Integer.parseInt(new String(c));

		int diff = highestNum - lowestNum;
		return diff;
	}

	public static int minMaxDifference(int num) {
		String s = Integer.toString(num);
		String t = s;
		
		int pos = 0;
		
		while(pos<s.length() && s.charAt(pos)=='9') {
			pos++;
		}
		
		if(pos<s.length()) {
			s = s.replace(s.charAt(pos), '9');
		}
		
		t = t.replace(t.charAt(0), '0');
		
		int max = Integer.parseInt(s);
		int min = Integer.parseInt(t);
		
		return max-min;
	}
}
