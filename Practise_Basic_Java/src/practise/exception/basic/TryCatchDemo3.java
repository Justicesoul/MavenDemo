// As same as TryCatchDemo2

package practise.exception.basic;

public class TryCatchDemo3 {

	public static void main(String[] args) {
	      int age = 17;
	      
	      try {
	          // Chỗ này có thể bị ngoại lệ TooOldException,
	          // hoặc TooYoungException
	          AgeUtils.checkAge(age);
	          System.out.println("You pass!");
	 
	      } catch (TooYoungException | TooOldException e) {
	          // Gộp 2 ngoại lệ trong cùng một khối catch
	          System.out.println("Your age invalid, you not pass");
	          System.out.println(e.getMessage());
	 
	      }
	}
}
