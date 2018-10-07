package stringBuilder;

public class StringBuilderLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = new String[] {"one", "two", "three", "four", "five", "six", "seven" };
		
		StringBuilder builder = new StringBuilder();
		for( String s : list){
			if(builder.length() > 0) builder.append(", ");
			builder.append('"').append(s).append('"'); 
		}
		System.out.println(builder.toString());
	}

}
