package practise.exception.basic2;

public class WrapperExceptionDemo {

	public static void main(String[] args) {
		// Một người tham gia tuyển dụng.
		Person person = new Person("Marry", Person.FEMALE, 20);

		try {
			// Ngoại lệ có thể xẩy ra tại đây.
			ValidateUtils.checkPerson(person);

		} catch (ValidateException wrap) {
			// Lấy ra nguyên nhân thực sự.
			// Mà có thể là TooYoungException, TooOldException, GenderException
			Exception cause = (Exception) wrap.getCause();

			// CAUSE MESSAGE (This snippet works only if checkPerson() using try-catch)
			if (cause != null) {
				System.out.println("Not pass, cause: " + cause.getMessage());
			} else {
				System.out.println(wrap.getMessage());
			}
		}
	}
}
