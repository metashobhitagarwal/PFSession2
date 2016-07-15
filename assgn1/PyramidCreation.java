package assgn1;

/*
	 * Program is divided into 3 parts 
	 * 1. spaces: to calculate space
	 * 2. numbers: to calculate numbers
	 * 3. 
	 */
public class PyramidCreation {
	
	public String[] getPyramidPattern(int rowCount){
		String spaces, numberSeries;
		String pattern[]= new String[2*rowCount-1];
		int count= 0;
		
		for(int i=1; i<=rowCount; i++){
			spaces= getSpaces(rowCount, i);
			numberSeries= getNumberSeries(i);
			pattern[count++]= spaces + numberSeries;	
		}
		for(int i= rowCount-1; i>=1; i--){
			spaces= getSpaces(rowCount, i);
			numberSeries= getNumberSeries(i);
			pattern[count++]= spaces + numberSeries;	
		}
		return pattern;
	}
	
		public String getSpaces(int rowCount, int iteration){
		String temp= "";
		
		while(rowCount>iteration){
			temp+= " ";
			rowCount--;
		}
		return temp;
	}
	
	
	public String getNumberSeries(int iteration){
		String noSeries= "";
		int temp= iteration, j= 1;
		
		while(j<=iteration){
			noSeries+= ""+j;
			j++;
		}
		while(temp>1){
			noSeries+= ""+(temp-1);
			temp--;
		}	
		return noSeries;
	}
}