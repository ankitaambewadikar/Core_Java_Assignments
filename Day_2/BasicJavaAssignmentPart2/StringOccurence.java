package day_2;

public class StringOccurence {

	public int checkString(String[] names, String find) {
		
		int stringLength = names.length;
		int occur=0;
		String found=" ";		
		for(int counter=0 ; counter < stringLength ; counter++){
			if(names[counter].equals(find)){
				
				//System.out.println("present");
				found=names[counter];
				//System.out.println(found);
				occur+=1;
			}
		}
		//System.out.println(occur);
		return occur;
	}

}
