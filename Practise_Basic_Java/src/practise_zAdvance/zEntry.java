package practise_zAdvance;

public class zEntry<KeyType, ValueType> {
	 private final KeyType key;
	 private final ValueType value;
	 
	 public zEntry(KeyType key, ValueType value) {
	 this.key = key;
	 this.value = value;
	 }
	 
	 public KeyType getKey() {
	 return key;
	 }
	 
	 public ValueType getValue() {
	 return value;
	 }
	 
	 public String toString() {
	 return "(" + key + ", " + value + ")";
	 }
}
