package practise;

public abstract class _4_Animal {
    public String talk() {
        throw new UnsupportedOperationException("Animal has not implement talk");
     }
    public void Say(){
    	System.out.println(talk());
    }
}
