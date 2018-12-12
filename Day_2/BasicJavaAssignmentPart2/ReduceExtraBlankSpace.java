package day_2;

public class ReduceExtraBlankSpace {

	public String checkBlankSpace(String input) {
		
		String content = new String();
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
		int pos;
		content = input.replace("IS", "");
		System.out.println(content);
		//String one=removeCharAt(input,6);
		int length = input.length();
		System.out.println(length);
		//for (int counter=6;counter<input.length() && input = "IS")
		//System.out.println(one);
		return null;
	}


}
