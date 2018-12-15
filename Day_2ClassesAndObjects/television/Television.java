package television;

public class Television {
	
	 private boolean state;
	 private int currentVolume;
	 private int changeVolume;


	Television(boolean state) {

		this.state = state;
	}
	
	public int initilizeCurrentVolume(int i){
		
		return this.currentVolume = currentVolume;
	}

	public boolean stateOfTelevision() {
		
				if(state == true )
					return true;
				else
					return false;	
	
	}

	public int getVolume() {
		
				if(state == true)
					return currentVolume;
		
				else
					System.out.println("TV OFF");
		
			return 0;
		
	}

	public int getIncreaseVolume() {
		
		int changeVolume=initilizeCurrentVolume(currentVolume);
		System.out.println(changeVolume);
		if(state == true){
			changeVolume = getVolume(); 
			changeVolume++;
			System.out.println(changeVolume);
			return changeVolume;
			
		}
		else
			return 0;
	}
	public int getDecreaseVoulume(){
		
		return currentVolume;
		
	}
	


	
}
