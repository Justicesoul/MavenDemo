// INTERFACE Talk Test

package practise_Object_Oriented;

interface Talk {
    String talk();
}

class Cat implements Talk {
    public String talk() {
        return "Meow!";
    }
}

class Radio implements Talk {
    public String talk() {
        return "This is the Voice of America!";
    }
}

public class Java_Object_Oriented5 {
	public static void main(String[] args) {
        Talk[] things = new Talk[2];
        things [0]	= new Cat();
        things [1]	= new Radio();
        
        for (Talk sthings : things) {
        	  System.out.println(sthings.talk());
		}
    }
}
