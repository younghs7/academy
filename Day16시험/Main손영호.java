package day16시험;

public class Main손영호{

	
	public static void main(String[] args) {
		
		
	int[] stAvg = new int[] {56, 44, 87, 90, 68, 98, 77, 90, 97, 98};
	
	//true 오름차순 false 내림차순 
	int[] sortedStAvg = BubbleSort손영호.bubbleSort(stAvg, false);
	
	//프린트 등수
	BubbleSort손영호.printArray(sortedStAvg);
	
	
	

	}

}
