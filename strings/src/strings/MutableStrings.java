package strings;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("Sachin");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" is a great batsman");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.insert(12, "very ");
		System.out.println(sb);
		
		sb.delete(12, 17);
		System.out.println(sb);
		
		sb.replace(0, 6, "Dhoni");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
