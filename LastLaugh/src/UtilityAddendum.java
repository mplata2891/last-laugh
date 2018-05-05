public int takeSelection(int maxSelection){
	
	boolean isSelectionValid = false;
	int selection = 0;
	
	do{
		selection = this.takeInteger();
	
		isSelectionValid = this.validateSelection(selection, maxSelection);
	
		if(isSelectionValid == false){
			this.displayErrorMsg();
		}
	}while(isSelectionValid == false);
	
	return selection;
}

public int takeInteger(){
	
	Scanner input = new Scanner(System.in);
	
	int number;
	
	number = input..nextInt();
	
	return number;
}

public boolean isSelectionValid(int input, int max){
	
	boolean validFlag = false;
	
	if(input > 0 && input <= max){
		validFlag = true;
	}
	
	return validFlag;
}