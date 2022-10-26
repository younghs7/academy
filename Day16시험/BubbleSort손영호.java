package day16시험;


public class BubbleSort손영호 {
	
//	1. 등수를 정하기 위해 평균점수를 정렬하는 메소드를 작성하시오.
	public static int[] bubbleSort(int[] array, boolean is오름차순)
	{
		int temp = 0;
		for(int i =0; i<array.length-1; i++)
		{
			for(int k=0; k<array.length-1-i; k++)
			{	
				
				if(is오름차순 == true)
				{	
					if(array[k] > array[k+1]) 
					{
						temp = array[k];
						array[k] = array[k+1];
						array[k+1] = temp;
					}
					
				}
				else
				{
					if(array[k] < array[k+1]) 
					{
						temp = array[k];
						array[k] = array[k+1];
						array[k+1] = temp;
					}
				}
			
			}
		}
		
	
		return array;
	}
	
	
	
	
	
//	2. 정렬된 등수를 출력하는 메소드를 작성하시오.
	public static void printArray(int[] array)
	{	
		int rank= 1;
		for(int i = 0; i <array.length; i++)
		{	
			System.out.println(rank+"등: "+array[i]);
			rank++;
		}
	}
	
	
	
	
	
	
}
