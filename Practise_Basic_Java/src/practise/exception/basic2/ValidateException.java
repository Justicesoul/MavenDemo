// Class ValidateException bao lấy một Exception khác.

package practise.exception.basic2;

public class ValidateException extends Exception {
    
	   /**
	 * 
	 */
	private static final long serialVersionUID = -6716872563923681138L;

	// Gói Exception trong một Exception khác
	   public ValidateException(Exception e)  {
	       super(e);
	   }
}
