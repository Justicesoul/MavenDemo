/*Ví dụ dưới đây, chúng ta sẽ gộp bắt các ngoại lệ thông qua ngoại lệ ở cấp cao hơn. 
 *Ở cấp cao hơn nó sẽ tóm được ngoại lệ đó và tất cả các ngoại lệ con. */

// As same as TryCatchDemo3

package practise.exception.basic;

public class TryCatchDemo2 {

	public static void main(String[] args) {

	      int age = 15;
	 
	      try {
	          // Chỗ này có thể bị ngoại lệ TooOldException,
	          // hoặc TooYoungException
	          AgeUtils.checkAge(age);
	 
	          System.out.println("You pass!");
	 
	      } catch (AgeException e) {
	          // Nếu có ngoại lệ xẩy ra, kiểu AgeException
	          // Khối catch này sẽ được chạy
	 
	          System.out.println("Your age invalid, you not pass");
	          System.out.println(e.getMessage());
	 
	      }
	}

}
