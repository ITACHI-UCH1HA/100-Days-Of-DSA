package day_019_date_2024_06_14;

public class MaxDifferenceYouCanGetFromChangingAnInteger {

	public static void main(String[] args) {
		int num = 555;
		// 923456-123456
		System.out.println(maxDiff(num));
	}

	public static int maxDiff(int num) {
		String a = Integer.toString(num);
		String b = a;
		
		char c[] = a.toCharArray();
		
		boolean found = false;
		char x = ' ';
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]!='9' && !found) {
				x = c[i];
				found = true;
			}
			
			if(c[i]==x) {
				c[i] = '9';
			}
		}
		
		a = new String(c);
		
		found = false;
		x = ' ';
		boolean first = false;
		c = b.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='1' && !found) {
				continue;
			}
			
			if(c[i]=='0') {
				continue;
			}
			
			if(i==0 && c[i]!='1' && !found) {
				found = true;
				x = c[i];
				first = true;
			}
			
			if(c[i]!=0 && !found) {
				found = true;
				x = c[i];
			}
			if(c[i]==x && first) {
				c[i] = '1';
			}
			
			if(c[i]==x && !first) {
				c[i] = '0';
			}
		}
		
		b = new String(c);
		
		return Integer.parseInt(a)-Integer.parseInt(b);
	}
}


//if(i==0 && c[i]!='1') {
//	found = true;
//	first = true;
//	x = c[i];
//}
//if(c[i]!='0' && !found) {
//	found = true;
//	x = c[i];
//}
//if(first && c[i]==x) {
//	c[i] = '1';
//}else if(c[i]==x) {
//	c[i] = '0';
//}
