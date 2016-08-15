package practise.exception.basic;

public class TryCatchDemo0 {

	public static void main(String[] args) throws TooYoungException, TooOldException {
		// Bắt đầu tuyển dụng
		System.out.println("Start Recruiting ...");
		// Kiểm tra tuổi của bạn.
		System.out.println("Check your Age");
		int age = 50;

		AgeUtils.checkAge(age);
	}

}
