package practise.exception.basic;

import practise.exception.basic2.GenderException;
import practise.exception.basic2.Person;

public class AgeUtils {
	  // Method này làm nhiệm vụ kiểm tra tuổi.
	  // Nếu tuổi nhỏ hơn 18 method sẽ ném ra ngoại lệ TooYoungException
	  // Nếu tuổi lớn hơn 40 method sẽ ném ra ngoại lệ TooOldException
	  public static void checkAge(int age) throws TooYoungException, TooOldException {
	      if (age < 18) {
	          // Nếu tuổi nhỏ hơn 18, ngoại lệ sẽ được ném ra
	          // Method này kết thúc tại đây.
	          throw new TooYoungException("Age " + age + " too young");
	      } else if (age > 40) {
	          // Nếu tuổi lớn hơn 40, ngoại lệ sẽ được ném ra.
	          // Method này kết thúc tại đây.
	          throw new TooOldException("Age " + age + " too old");
	      }
	      // Nếu tuổi nằm trong khoảng 18-40.
	      // Đoạn code này sẽ được chạy.
	      System.out.println("Age " + age + " OK!");
	  }
	  
		public static void checkGender(String gender) throws GenderException{
			// Nếu người đó là Nữ, nghĩa là không hợp lệ.
			if (gender == Person.FEMALE){
				//			throw new ValidateException(new GenderException("Do not accept women"));
				throw new GenderException("Woman is not acceptable!");
			}
			System.out.println("Gender " + gender + " OK!");
		}
}
