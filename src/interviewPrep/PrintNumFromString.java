package interviewPrep;

public class PrintNumFromString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphaNumericString = "h89ll0";
		char[] carray = alphaNumericString.toCharArray();
		for (char c : carray) {
			// if (Character.isDigit(c)) {
			if ((int) c >= '0' && (int) c <= '9') { // 'a' to 'z'
				System.out.println(c);
			}
		}
	}

	public void conversions() {
		int a = 1;
		char b = (char) a;
		System.out.println(b);

		int c = '1';
		char d = (char) c;
		System.out.println(d);

		int e = 1;
		char f = (char) (e + '0');
		System.out.println(f);

		int g = 1;
		char h = Integer.toString(g).charAt(0);
		System.out.println(h);
		
		//String to int conversion
		//Integer.parseInt(str);  returns primitive int
		//Integer.valueOf(str); returns Integer object
		
		//int to String conversion
		//Integer.toString(int);
		//String.valueOf(int);
		
	}

}