package dia013.view;

public class StringBufferBuilder {
	public void main() {
		StringBuffer sbf = new StringBuffer("hello");
		sbf.append(" world");
		System.out.println(sbf);
		
		StringBuilder spf = new StringBuilder("hello");
		spf.append(" world");
		System.out.println(sbf);

	}
}
