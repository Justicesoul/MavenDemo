package practise.exception.basic;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		String text = "001234A2";
		int value = toInteger(text);
		System.out.println("Value= " + value);
	}

	
	public static int toInteger(String text) {
		try {
			System.out.println("Begin parse text: " + text);
			// Tại đây có thể phát sinh ngoại lệ NumberFormatException
			int value = Integer.parseInt(text);
			return value;

		} catch (NumberFormatException e) {
			// Trong trường hợp 'text' không phải là số.
			// Khối catch này sẽ được thực thi.
			System.out.println("Number format exception is " + e.getMessage());
			// NumberFormatException xẩy ra, trả về 0.
			return 0;

		} finally {
			// Khối finally này luôn được thực thi. Sau đó là return.
			System.out.println("End parse text: " + text);
		}
	}
}
