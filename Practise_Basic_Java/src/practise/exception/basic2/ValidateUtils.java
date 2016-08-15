package practise.exception.basic2;

import practise.exception.basic.AgeUtils;

public class ValidateUtils {
	public static void checkPerson(Person person) throws ValidateException {
		try {
			// Kiểm tra tuổi và giới tính
			// Hợp lệ là trong khoảng 18-40
			// Method này có thể ném ra TooOldException,TooYoungException, GenderException
			AgeUtils.checkAge(person.getAge());
			AgeUtils.checkGender(person.getGender());

		} catch (Exception e) {
			// Nếu không hợp lệ
			// Gói ngoại lệ này bằng ValidateException
			throw new ValidateException(e);
		}

//		// Only use this will make the CAUSE MESSAGE = NULL
//		AgeUtils.checkAge(person.getAge());
//		AgeUtils.checkGender(person.getGender());
	}
}
