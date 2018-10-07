package stringBuilder;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = new String[] {"one", "two", "three", "four", "five", "six", "seven" };
		
		String temp = "";
		for(String s : list){
			if(temp.length() > 0) temp = temp + ", ";
			temp = temp + "\"" + s + "\""; // 매번 새 객체가 생성되어서 temp에 대입 됨.
		}
		System.out.println(temp);
		
		StringBuilder builder = new StringBuilder();
		for( String s : list){
			if(builder.length() > 0) builder.append(", ");
			builder.append('"');
			builder.append(s);
			builder.append('"'); // 새 객체가 생성되지 않는다. 
		}
		System.out.println(builder.toString());
	}

}
