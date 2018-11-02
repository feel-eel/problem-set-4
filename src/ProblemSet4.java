/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.lang.Math; 

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		
		System.out.println(ps4.surroundMe("<<>>", "abc"));
		System.out.println(ps4.endsMeet("basketball", 3));
		System.out.println(ps4.middleMan("candy"));
		System.out.println(ps4.doubleVision("a"));
		System.out.println(ps4.centered("qwerty", "qrweee"));
		System.out.println(ps4.upOrDown(12.2, 'c'));
		System.out.println(ps4.countMe("one more batch of sample words", 'h'));
		System.out.println(ps4.isNotEqual("is not not is not"));
		System.out.println(ps4.triplets("aaa bbb"));
		System.out.println(ps4.addMe("a123b456c789", true));
	}
	
	
	public String surroundMe(String out, String in) {
		if (out.length() != 4 || in.length() != 3) {
			return null;
		} else if (out == null || in == null){
			return null;
		}
		String a1 = out.substring(0, 2);
		String b1 = in.substring(0, 3);
		String a2 = out.substring(2, 4);
		String result = a1 + b1 + a2;
		return result;
	}
	
	
	public String endsMeet(String str, int n) {
		if (str == null || str.length() < 1 || str.length() > 10 || n < 1 || n > str.length()) {
			return null;
		}
		String a = str.substring(0, n);
		String b = str.substring(str.length()-n, str.length());
		String result = a + b;
		return result;
	}
	
	public String middleMan(String str) {
		if (str == null || str.length() % 2 != 1) {
			return null;
		}
		String a = str.substring(str.length()/2-1, str.length()/2+2);
		return a;
	}
	
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			String a1 = str.substring(i, i+1);
			result  = result + a1 + a1;
		}
		return result;
	}
	
	public boolean centered(String str, String b) {
		if (str == null || b == null || b.length() != 3) {
			return false;
		}
		String mid = str.substring(str.length()/2-1, str.length()/2+2);
		if (mid.equals(b)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int upOrDown(double n, char a) {
		if (a == 'r') {
			return (int) Math.round(n);
		}
		if (a == 'f') {
			return (int) Math.floor(n);
		}
		if (a == 'c') {
			return (int) n+1;
		}
		else {
			return -1;
		}
	}
	
	public int countMe(String n, char a) {
		if (!Character.isLetter(a)) {
			return -1;
		}
		else if (n == null) {
			return -1;
		}
		int count = 0;
		for(int i = 0; i < n.length(); i++) {
			if (a == n.charAt(i) && i != (n.length() - 1) ) {
				if (n.charAt(i+1) == ' ') {
					count++;
				}
			}
			else if (a == n.charAt(i) && i == (n.length() - 1)) {
				count++;
			}
		}
		return count;
	}
	
	public boolean isNotEqual(String n) {
		if (n == null) {
			return false;
		}
		int is = 0;
		int not = 0;
		for(int i = 0; i < n.length() - 2; i++) {
			String x = n.substring(i, i+2);
			String y = n.substring(i, i+3);
			if (x.equals("is")) {
				is++;
			}
			else if (y.equals("not")) {
				not++;
			}
		}
		if (is == not) {
			return true;
		} else {
			return false;
		}
	}
		public int triplets(String n) {
			if (n == null) {
				return -1;
			}
			int count = 0;
			for(int i = 0; i < n.length() - 2; i++) {
				if (n.charAt(i) == ' ') {
					return -1;
				}
				if (n.charAt(i) == n.charAt(i+1) && n.charAt(i+1) == n.charAt(i+2)) {
					count++;
				}
			}
			return count;
	}
		
		public int addMe(String n, boolean x) {
			if (n == null) {
				return -1;
			}
			int count = 0;
			for(int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == ' ') {
					return -1;
				}
				int y = n.charAt(i);
				if (x == false && !Character.isLetter(y)) {
					int num = 0;
					for(int j = 0; j < n.length(); j++) {
						char other = n.charAt(i);
						if (!Character.isLetter(other)) {
							num = num * 10 + other;
						} else {
							break;
						}
					}
					count = count + num;	
				}
				else if (x == true && !Character.isLetter(y)) {
					System.out.println(count);
					System.out.println(y);
					System.out.println(y + count);
					count = count + n.charAt(i);
				}
			}
			return count;
	}
}











